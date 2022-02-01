package lt.codeacademy.model;

public class Person {

    private static final String NONE_PERSONAL_CODE = "NONE";

    private String name;
    private final String personalCode;
    private final boolean sex;

    public Person() {
        this(false);
    }

    public Person(boolean sex) {
        this.sex = sex;
        this.personalCode = NONE_PERSONAL_CODE;
        this.name = "";
    }

    public Person(String name) {
        this(true);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getPersonalCode() {
        return personalCode;
    }
}
