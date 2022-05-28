전략 패턴
==

1. 여러 알고리듬을 캡슐화하고 상호 교환 가능하게 만드는 패턴
2. 새로운 전략을 추가하더라도 기존 코드를 변경하지 않는다
3. 클라이언트 코드가 구체적인 전략을 알아야 한다.


비교 대상 

```java
public class Student  {

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
```

<br>

전략을 정한 클래스(여기서 Comparator 인터페이스가 전략을 추상화한 것)

여기서 전략은 오름차순, 내림차순으로 정할 수 있음
```java
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore() > o2.getScore() ? 1 : -1;
    }
}
```

<br>

사용처 

```java
public class School {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setScore(95);

        Student s2 = new Student();
        s2.setScore(90);

        Student s3 = new Student();
        s3.setScore(100);

        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        StudentComparator comparator = new StudentComparator();


        Collections.sort(students, comparator);

        students.forEach(student -> System.out.println(student.getScore()));


    }
}
```