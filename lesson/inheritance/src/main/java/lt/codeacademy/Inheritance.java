package lt.codeacademy;

import lt.codeacademy.model.Student;
import lt.codeacademy.model.Teacher;

import java.util.Scanner;

public class Inheritance {

    private Scanner scanner = new Scanner(System.in);

    public void init() {
        Student student = new Student("Vardenis", "Pavardenis");
        Teacher teacher = new Teacher("Petras", "Mokytojas");

        System.out.println(student.getName() + " " + student.getSurname());
        System.out.println(teacher.getName() + " " + teacher.getSurname());
    }
}
