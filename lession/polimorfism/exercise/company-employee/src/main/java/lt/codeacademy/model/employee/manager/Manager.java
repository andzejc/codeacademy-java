package lt.codeacademy.model.employee.manager;

import lt.codeacademy.model.employee.DutyType;
import lt.codeacademy.model.employee.Employee;

public class Manager extends Employee {

    protected Manager(String name) {
        super(name, DutyType.MANAGER);
    }

    @Override
    public boolean hasAccessForParking() {
        return true;
    }

    @Override
    public boolean couldHaveFreeLunch() {
        return true;
    }

    @Override
    public boolean couldOrderCar() {
        return true;
    }
}
