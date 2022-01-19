package lt.codeacademy; // 1

import java.util.Random; // 2

public class User { // 3

    int age = 0;  // 4
    boolean isTrue;
    String name = "Nezinomas";
    String surname = "???";
    String fullname = name + surname;
    String newStr = new String();
    String newStr2;
    Random r;

    static
    {System.out.println("initialize block");}

    public User() {
        System.out.println("Created new user: " + this.name + ". Age: " + this.age);
    }

    public void User() { //5
        System.out.println("Created new user: " + this.name + ". Age: " + this.age);
    }

    public User(int age, String name) {
        this.name = name;
        this.age = age;
        System.out.println("Created new user: " + this.name + ". Age: " + this.age);
    }

    public void makeSomeStuff (String stuff) {
        int someInt = 0;
        System.out.println(stuff);
        System.out.println(someInt);
    }

    public void varScope() {
        int a;
        var b = "string";
        var c = 10;
        if(true) {
            int d = 10;
            a = 100;
        }

        System.gc();

    }
}
