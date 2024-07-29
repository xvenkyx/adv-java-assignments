package pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age)
            return -1;
        else
            return 1;
    }
}

public class Main {
    public static void main(String[] args) {

        Comparator<Integer> IntegerComparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return -1;
                else
                    return 1;
            }
        };

        Comparator<Student> StudentComparator = new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if (o1.age > o2.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(9);
        nums.add(1);
        nums.add(17);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "John"));
        studs.add(new Student(18, "William"));
        studs.add(new Student(11, "Annie"));
        studs.add(new Student(55, "MM"));

        System.out.println("==================================================");
        System.out.println("Sorting without using comparator : ");
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("Sorting using comparator : ");
        Collections.sort(nums, IntegerComparator);
        System.out.println(nums);
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Sorting Students using == || Comparable || ==");
        Collections.sort(studs);
        for (Student s : studs)
            System.out.println(s);
        System.out.println("Sorting Students using == || Comparator || ==");
        Collections.sort(studs, StudentComparator);
        for (Student s : studs)
            System.out.println(s);
        System.out.println("==================================================");        
    }
}
