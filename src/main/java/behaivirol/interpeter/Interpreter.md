인터프리터 패턴
===

1. 자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 패턴
2. 자주 등장하는 것을 값만 바꿔서 재사용가능
3. 단, 인터프리팅하는데 복잡한 문법을 만들면 구현이 어려움 

<br>


```java
// 성 + 이름 + 멘트 구조가 반복 될 떄
// 성.이름.멘트 를 한번에 받아서 자주 처리할 수 있게 인터프리터 패턴 적용
public class InfoInterpreter {

    public static MentVo parsingInfo(String ment){
        String[] arr = ment.split("\\.");
        
        MentVo mentVo = new MentVo();
        mentVo.setFirstName(arr[0]);
        mentVo.setLastName(arr[1]);
        mentVo.setMent(arr[2]);
        
        return mentVo;
    }
}
```

<br>

```java
public class Greet {

    public void greet(String info){
        MentVo mentVo = InfoInterpreter.parsingInfo(info);

        System.out.println(mentVo.getFirstName()+" "+mentVo.getLastName()+" "+mentVo.getMent());
    }
}
```

<br>

```java
public class App {

    public static void main(String[] args) {
        Greet greet = new Greet();

        greet.greet("bae.suzy.안녕하세요");
    }
}
```