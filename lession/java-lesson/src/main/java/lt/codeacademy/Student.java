package lt.codeacademy;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.name);
    }

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Petras"));
        students.add(new Student("Jonas"));
        students.add(new Student("Andrius"));
        Collections.sort(students);
        System.out.println(students);
    }
}
