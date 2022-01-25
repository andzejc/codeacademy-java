package lt.codeacademy.model;

public class Student extends Person {

    private GroupType groupType = GroupType.NONE;

    public Student() {
        super();
    }

    public Student(String name, String surname) {
        this(name, surname, GroupType.NONE);
    }

    public Student(String name, String surname, GroupType groupType) {
        super(name, surname);
        this.groupType = groupType;
    }

    public String getGroupTypeAsString() {
        return groupType.getType();
    }
}
