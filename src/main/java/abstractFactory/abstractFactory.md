추상 팩토리 패턴
==================
서로 관련있는 여러 객체를 만들어주는 인터페이스

목적

1. 클라이언트의 코드에서 구체 클래스를 제거 할 수 있게 한다.

설명

추상 팩토리 패턴은 여러 객체가 한 클래스안에 있는 복잡한 구조의 클래스를 추상화된 곳에서 생석하는 방식<br>
아래 예시 패턴에서 보면 자동차에 핸들, 휠이 있는데(자동차 클래스에 핸들, 휠 클래스가 들어 있다)
<br>
이 복잡한 자동차 클래스를 생성하는 팩토리를 만들고 그 자동차를 만드는 팩토리는 <br>
추상 팩토리를 상속 받는다.
<br>
이러면 클라이언트에서는 추상 팩토리를 구현한 구체 자동차 팩토리(현대,기아)<br>
를 이용하면 자동차안의 핸들, 휠까지는 몰라도 온전한 자동차를 얻는다.


패턴
==

추상 팩토리 클래스를 이용하는 클래스이다.
<br>
아래에서 보면 CarPartsFactory가 추상 클래스인데 CarPartsFactory클래스를 구현한<br>
클래스에 따라 Handle, Wheel이 바뀌게 된다(즉, 연관된 클래스들이 모두 바뀐다)
```java
public class CarFactory {

    private CarPartsFactory carPartsFactory;


    public CarFactory(CarPartsFactory carPartsFactory){
        this.carPartsFactory = carPartsFactory;
    }


    public void makeCar(){
        Car car = new Car();

        car.setHandle(carPartsFactory.createHandle());
        car.setWheel(carPartsFactory.createWheel());
    }
}
```

아래는 추상 팩토리를 구현한 구체 팩토리가 된다.
```java
public class HyundaiCarPartsFactory implements CarPartsFactory {

    @Override
    public Wheel createWheel() {
        return new HyundaiWheel();
    }

    @Override
    public Handle createHandle() {
        return new HyundaiHandle();
    }
}
```

```java
public class KiaCarPartsFactory implements CarPartsFactory {

    @Override
    public Wheel createWheel() {

        return new KiaWheel();
    }

    @Override
    public Handle createHandle() {
        return new KiaHandle();
    }
}
```

실제 이용하는 클라이언트는 팩토리에서 어떤 구체클래스를 이용하는지 모르지만<br>
이용하려는 구체 클래스를 받을 수 있다. 
```java
public class ClientRealWorld {

    public void live(){
        CarFactory hyundaiFactory = new CarFactory(new HyundaiCarPartsFactory());

        hyundaiFactory.makeCar();

        CarFactory kiaFactory = new CarFactory(new KiaCarPartsFactory());

        kiaFactory.makeCar();
    }
}
```