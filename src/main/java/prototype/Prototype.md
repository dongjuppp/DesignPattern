프로토타입 패턴
====


기존의 인스턴스를 복제하여 새로운 인스턴스를 생성하는 방법

1. DB, Http통신을 통해 가져온 데이터가 들어있는 인스턴스를 복제하여 이용할 떄 사용

Java에는 clone이란 메소드를 제공해 주고 있음. Cloneable 인터페이스를 이용하여 clone메소드를 사용
<br>
주의점은 clone메소드는 얕은 복사를 해주기 때문에 재귀적으로 복제(deep copy)가 필요한 경우 clone메소드안에서 직접 구현해 줘야함

<br>

```java
public class FromDbData implements Cloneable {

    private String name;

    private String schoolName;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public boolean equals(Object obj) {
        FromDbData target = (FromDbData)obj;

        return this.name == target.name
                && this.age==target.age
                && this.schoolName == target.schoolName;
    }
}
```


```java
public class Main {


    public void main() throws CloneNotSupportedException{
        FromDbData fromDbData = new FromDbData();

        FromDbData stupidClone = new FromDbData();
        stupidClone.setAge(fromDbData.getAge());
        stupidClone.setName(fromDbData.getName());
        stupidClone.setSchoolName(fromDbData.getSchoolName());



        FromDbData smartClone = (FromDbData) fromDbData.clone();

        System.out.println(smartClone != fromDbData); //False
        System.out.println(smartClone.equals(fromDbData)); //True
        System.out.println(smartClone.getClass() == fromDbData.getClass()); //True

    }
}
```