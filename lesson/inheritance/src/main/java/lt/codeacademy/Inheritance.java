package lt.codeacademy;

import lt.codeacademy.model.Student;

import java.util.Scanner;

public class Inheritance {

    private Scanner scanner = new Scanner(System.in);

    public void init() {
        Student student = new Student();
        Student student1 = new Student("Vardenis", "Pavardenis");
    }
}
