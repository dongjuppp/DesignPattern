템플릿 패턴
==

1. 알고리듬 구조를 서브 클래스가 확장할 수 있도록 템플릿으로 제공하는 방법
2. 추상 클래스는 템플릿을 제공하고 하위 클래스는 구체적인 알고리듬을 제공한다.
3. 리스코프 치환 원칙을 위반할 수도 있다.
4. 알고리듬 구조가 복잡할 수록 템플릿을 유지하기 어려워진다.

<br>
추상 클래스를 이용하는 방법

<br>

템플릿 클래스를 정의

하위에서 정할 구체적인 알고리즘을 추상 메소드의 형태로 제공

```java
public abstract class TemplateClass {

    public void process(){
        doFirst();
        doSecond();
    }


    protected abstract void doFirst();

    protected abstract void doSecond();
}
```

<br>
구체 클래스는 알고리즘 부분만 재정의 

```java
public class ConcreteClass extends TemplateClass {

    @Override
    public void doFirst() {
        System.out.println("첫번째!");
    }

    @Override
    public void doSecond() {
        System.out.println("두번째!");
    }
}

```


콜백을 이용하는 방법

<br>

인자로 알고리즘에 해당하는 인터페이스를 받음

```java
public class CallbackType {


    public void run(Runnable runnable){
        System.out.println("앞 동작");
        runnable.run();
        System.out.println("뒤 동작");
    }
}

```


```java
public class Client {

    public static void main(String[] args) {
        CallbackType callbackType = new CallbackType();
        
        callbackType.run(()->{
            System.out.println("가운데 동작");
        });
    }
}
```