package lt.codeacademy.model.employee.developers;

import lt.codeacademy.model.employee.DutyType;
import lt.codeacademy.model.employee.Employee;

public class Developer extends Employee {

    public Developer(String name) {
        super(name, DutyType.DEVELOPER);
    }
}
