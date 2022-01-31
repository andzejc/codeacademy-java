package lt.codeacademy.model.employee;

import lt.codeacademy.interfaces.HasDuty;
import lt.codeacademy.interfaces.Likeable;
import lt.codeacademy.interfaces.Nameble;

/**
 * Abstraction of employee that can get and give likes and has a duty within the company
 */
public class Employee implements HasDuty, Nameble, Likeable {

    private int numberOfLikes = 0;
    private final String name;
    private final DutyType dutyType;

    public Employee(String name, DutyType dutyType) {
        this.name = name;
        this.dutyType = dutyType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DutyType getDuty() {
        return dutyType;
    }

    @Override
    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    @Override
    public void giveLike() {
        this.numberOfLikes++;
    }
}
