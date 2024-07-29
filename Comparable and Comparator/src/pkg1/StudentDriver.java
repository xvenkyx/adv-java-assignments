package pkg1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "abst", 40));
        list.add(new Student(2, "ab", 35));
        list.add(new Student(3, "a", 95));
        list.add(new Student(4, "abs", 101));
        list.add(new Student(5, "abstv", 55));

        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("-----------------------");
        Collections.sort(list,new StudentComparator());
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
