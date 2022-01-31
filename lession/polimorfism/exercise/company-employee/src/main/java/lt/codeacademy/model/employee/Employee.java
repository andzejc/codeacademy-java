package lt.codeacademy.model.employee;

import lt.codeacademy.interfaces.HasAdvancedPrivilege;
import lt.codeacademy.interfaces.HasDuty;
import lt.codeacademy.interfaces.Likeable;
import lt.codeacademy.interfaces.Nameble;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstraction of employee that can get and give likes and has a duty within the company
 */
public abstract class Employee implements HasDuty, Nameble, Likeable, HasAdvancedPrivilege {

    private final String name;
    private final DutyType dutyType;

    private final List<Employee> likeGivers = new ArrayList<>();

    protected Employee(String name, DutyType dutyType) {
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
        return likeGivers.size();
    }

    @Override
    public void giveLike(Employee giver) {
        likeGivers.add(giver);
    }

    public List<Employee> getLikeGivers() {
        return likeGivers;
    }
}
