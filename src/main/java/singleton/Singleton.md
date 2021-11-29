싱글톤 패턴
=============
인스턴스를 오직 한개만 제공하는 클래스

 - 시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는
   경우가 있다. 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다.
   

목적

1. 인스턴스를 **오직 하나**만
2. 하나의 인스터스를 **Global하게** 접근 가능하도록

ex) 설정 같은것을 클래스로 정의할 경우

패턴 1

```java
public class Settings {
    
    private static Settings settings;

    private Settings() {

    }

    public static Settings getInstance() {
        if (settings == null) {
            return new Settings();
        }

        return settings;
    }

}
```
단점:
멀티 스레드 환경에서 안전하지 않음

---

패턴 2

```java
public class Settings {

    private static Settings settings;

    private Settings() {

    }

    public static synchronized Settings getInstance() {
        if (settings == null) {
            return new Settings();
        }

        return settings;
    }

}
```

단점:
getInstance에 접근시 Lock이 걸려 성능이 저하됨

---

패턴 3
<br>
eager initialization 
```java
public class Settings {

    private static final Settings SETTINGS = new Settings();

    private Settings() {

    }

    public static Settings getInstance() {
        return SETTINGS;
    }

}
```
스레드 safe함
<br>
단점:
미리 만드는 객체가 크다면, 로딩시 많은 리소스를 잡아먹음

---

패턴 4
<br>
double checked locking;
```java
public class Settings {

    private static volatile Settings settings = new Settings();

    private Settings() {

    }

    public static Settings getInstance() {
        if(settings == null){
            synchronized (Settings.class){
                if(settings == null){
                    settings = new Settings();
                }
            }
        }
        return settings;
    }

}
```
스레드 safe 함, synchronized까지는 거의 안옴

---

패턴 5

```java
public class Settings {

    private Settings(){}

   private static class SettingsHolder{
       private static final Settings settings = new Settings();
   }
   
   public static Settings getInstance(){
        return SettingsHolder.settings;
   }

}
```
멀티 스레드에서 안전함, lazy loading이 가능함


---

패턴 6
<br>
enum
```java
public enum Settings{
    INSTANCE;
}
```
enum은 하나의 클래스처럼 메소드도 가질 수 있음,
싱글톤 패턴을 깨는 2가지 방법으로도 꺨 수 없음

단점:
eager initialization와 마찬가지로 loading시 리소스를 잡아먹음
<br>
상속 관계를 가질 수 없음

싱글톤 패턴을 꺠는 방법
-------------------

1. 리플렉션
```java
Constructor<Settings> declaredConstructor = Settings.class.getDeclaredConstructor();
declaredConstructor.setAccessible(true);
Settings settings1 = declaredConstructor.newInstance();
```

2. 직렬화, 역직렬화
 - protected Object getResolve(){ return getInstance()} 로 막을 수 있음

