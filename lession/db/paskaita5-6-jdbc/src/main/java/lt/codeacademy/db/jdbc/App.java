package lt.codeacademy.db.jdbc;

import lt.codeacademy.db.jdbc.manager.DbConnector;
import lt.codeacademy.db.jdbc.service.EmployeeService;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        DbConnector dbConnector = new DbConnector();

        new EmployeeService().getEmployee();
        new EmployeeService().findEmployeeByDate(LocalDate.of(2022, 01, 01));
    }
}
