package lt.codeacademy;

import lt.codeacademy.model.employee.Employee;
import lt.codeacademy.model.employee.ProjectManager;
import lt.codeacademy.model.employee.developers.JuniorDeveloper;
import lt.codeacademy.model.employee.developers.MidDeveloper;
import lt.codeacademy.model.employee.developers.SeniorDeveloper;
import lt.codeacademy.service.LikeManager;
import lt.codeacademy.simulator.CompanySimulator;

import java.util.HashMap;
import java.util.Map;

/**
 * Wrapper class that acts as a company
 */
public final class Company {

    public Company() {
        Map<String, Employee> employees = new HashMap<>();
        LikeManager likeManager = new LikeManager();

        employees.put("PM-1", new ProjectManager("Projektu vadovas 1"));
        employees.put("PM-2", new ProjectManager("Projektu vadovas 2"));
        employees.put("SD-1", new SeniorDeveloper("Senas developeris 1"));
        employees.put("MD-1", new MidDeveloper("Dar ne senas developeris 1"));
        employees.put("JD-1", new JuniorDeveloper("Jaunelis developeris 1"));

        new CompanySimulator(likeManager).simulateCompany(employees);
    }

}
