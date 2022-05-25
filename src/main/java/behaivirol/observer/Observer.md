옵저버 패턴
==

1. 다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 패턴
2. 발행(publish)-구독(subscribe) 패턴을 구현할 수 있다
3. 구독 관리를 못하면 Memory Leak 발생 할 수 있다.

구독자의 역할을 하는 클래스의 인터페이스
```java
public interface Subscripter {

    void sendMassage(String message);
}
```

<br>

구독자 구체클래스 
```java
public class User implements Subscripter{

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public void sendMassage(String message) {
        System.out.println(name+" "+message);
    }
}
```

<br>

옵저버의 역할을 하는 클래스
<br>

구독, 구독취소, 메세지 뿌리기(혹은 변경 알림) 기능
```java
public class ChatServer {

    private Map<String, List<Subscripter>> observer= new HashMap<>();


    public void subscript(String subject, Subscripter subscripter){
        if(observer.containsKey(subject)){
            observer.get(subject).add(subscripter);
        }
        else{
            List<Subscripter> subscripters = new ArrayList<>();
            subscripters.add(subscripter);
            observer.put(subject, subscripters);
        }
    }

    public void unSubscript(String subject, Subscripter subscripter){
        if(observer.containsKey(subject)){
            observer.get(subject).remove(subscripter);
        }
    }

    public void sendMessage(User user, String subject, String message){
        if(observer.containsKey(subject)){
            observer.get(subject).forEach(s -> s.sendMassage(user.getName()+" "+message));
        }
    }
}
```

<br>
사용 클래스 

```java
public class Client {

    public static void main(String[] args) {
        User taeyeon = new User("태연");
        User yoona = new User("윤아");
        User suzy = new User("수지");
        User iu = new User("아이유");

        ChatServer chatServer = new ChatServer();

        chatServer.subscript("방송",taeyeon);
        chatServer.subscript("방송",yoona);
        chatServer.subscript("방송",suzy);
        chatServer.subscript("방송",iu);

        chatServer.sendMessage(taeyeon, "방송", "안녕!");
    }
}
```