package pkg1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.name.length() - o1.name.length();
    }
}
