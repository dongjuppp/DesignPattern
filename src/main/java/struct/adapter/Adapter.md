어뎁터 패턴
====

1. 클라이언트에서 사용하는 인터페이스가 내가 제공하려는 것과 다를 경우 어뎁터 패턴을 이용해서 인터페이스의 구현체를 변경하는 것
2. 클라이언트는 인터페이스의 operator()를 호출하고, 내가 제공하는 것은 execute()일때 어뎁터는 operator
3. 기존코드를 변경하지 않고 원하는 동작을 하도록 변경이 가능하다.
4. 소스코드의 복잡도가 올라간다.

클라이언트가 사용하는 인터페이스, 구현체 
```java
public interface Operator {

    void operator();
}
```
```java
public class OperatorImpl implements Operator {

    @Override
    public void operator() {
        System.out.println("오퍼레이터!!!");
    }
}

```

<br>
내가 제공하는 인터페이스, 구현체

```java
public interface Executor {

    void execute();
}

```

```java
public class OperatorImpl implements Operator {

    @Override
    public void operator() {
        System.out.println("오퍼레이터!!!");
    }
}
```

<br>

어뎁터는 클라이언트의 인터페이스를 상속하여 구현

```java
public class MyAdaptor implements Operator {

    private Executor executor = new ExecutorImpl();

    @Override
    public void operator() {
        executor.execute();
    }
}
```