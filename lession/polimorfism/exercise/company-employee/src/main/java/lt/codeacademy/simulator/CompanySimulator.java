package lt.codeacademy.simulator;

import lt.codeacademy.model.employee.DutyType;
import lt.codeacademy.model.employee.Employee;
import lt.codeacademy.service.LikeManager;

import java.util.Map;

import static lt.codeacademy.ConsolePrinter.print;

/**
 * Simulator class which shown if all working well
 */
public final class CompanySimulator {

    private final LikeManager manager;

    public CompanySimulator(LikeManager manager) {
        this.manager = manager;
    }

    public void simulateCompany(Map<String, Employee> employees) {
        print("Total likes given right now: "
                + manager.getTotalLikesByDuty(employees.values(), null));
        giveLike(employees.get("PM-1"), employees.get("PM-2"));
        getNumberOfLikes(employees.get("PM-1"));
        giveLike(employees.get("JD-1"), employees.get("MD-1"));
        getNumberOfLikes(employees.get("JD-1"));
        giveLike(employees.get("SD-1"), employees.get("MD-1"));
        getNumberOfLikes(employees.get("SD-1"));
        print("Total likes given right now: " + manager.getTotalLikesByDuty(employees.values(), null));
        print("Total likes developers given: " + manager.getTotalLikesByDuty(employees.values(), DutyType.DEVELOPER));
        print("Total likes managers given: " + manager.getTotalLikesByDuty(employees.values(), DutyType.MANAGER));
    }

    private void getNumberOfLikes(Employee employee) {
        int numberOfLikes = manager.getNumberOfLikesByEmployee(employee);
        print(employee.getName() + " has " + numberOfLikes + " likes now!");
    }

    private void giveLike(Employee receiver, Employee giver) {
        manager.giveLike(receiver);
        print(giver.getName() + " liked another person: " + receiver.getName());
    }
}
