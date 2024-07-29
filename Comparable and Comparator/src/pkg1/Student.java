package pkg1;

public class Student implements Comparable<Student>{

    int id;
    String name;
    int marks;
    
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.length() - s.name.length();
    }

    @Override
    public String toString() {
        return id + ". " + name + " Marks=" + marks;
    }
}
