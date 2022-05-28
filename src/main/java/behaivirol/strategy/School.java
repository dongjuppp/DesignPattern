package behaivirol.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
