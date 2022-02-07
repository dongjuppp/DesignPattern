팩토리 패턴
=========
구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.

목적

1. **비슷한 목적을 가진 구현체들**을 생성하는 것을 한 군데서 관리
2. 확장에는 유연하게, 변경에는 닫혀있는 구조로 객체를 관리(OCP)


패턴 1
```java
public class IdolFactory {
    
    
    public Idol getIdol(String groupName){
        
        if(groupName.equalsIgnoreCase("Itzy")){
            return new Itzy();
        }
        else if(groupName.equalsIgnoreCase("RedVelvet")){
            return new RedVelvet();
        }
        
        throw new IllegalArgumentException();
    }
}
```

단점: 구현체가 늘어갈때마다 팩토리 메소드가 **변경됨**


패턴 2

```java
public interface IdolFactory {

    default Idol createIdol(String name, int size){
        printName(name);

        printSize(name, size);

        return getIdol();
    }

    void printName(String name);

    void printSize(String name, int size);

    Idol getIdol();
}
```

<br/>

```java
public abstract class DefaultFactory implements IdolFactory {


    public void printName(String name){
        System.out.println(name+" 그룹 데뷔 준비중");
    }

    public void printSize(String name, int size){
        System.out.println(name + " 그룹 멤버수: "+size);
    }
}

```

<br/>

```java
public class ItzyFactory extends DefaultFactory {


    public Idol getIdol() {
        return new Itzy();
    }
}
```

단점: 구현체가 늘어날때 마다 Java파일이 지속적으로 늘어남
