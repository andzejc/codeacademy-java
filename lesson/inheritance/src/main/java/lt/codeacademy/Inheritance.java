package lt.codeacademy;

import lt.codeacademy.model.GroupType;
import lt.codeacademy.model.Student;
import lt.codeacademy.model.Teacher;

import java.util.Scanner;

public class Inheritance {

    private Scanner scanner = new Scanner(System.in);

    public void init() {
        Student student = new Student("Vardenis", "Pavardenis", GroupType.C2);
        Teacher teacher = new Teacher("Petras", "Mokytojas");

        System.out.println(student.getName()
                + " " + student.getSurname()
                + " " + student.getGroupTypeAsString());
        System.out.println(teacher.getName() + " " + teacher.getSurname());
    }
}
