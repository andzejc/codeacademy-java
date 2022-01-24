package lt.codeacademy.model;

public class Person {

    private String name;
    private String personalCode;
    private boolean sex;

    public Person() {
        System.out.println("Init default constructor!");
        this.sex = false;
    }

    public Person(String name) {
        this();
        this.name = name;
        System.out.println("Init param constructor!");
        this.sex = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }
}
