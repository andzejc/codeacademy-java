package lt.codeacademy.db.jdbc;

import lt.codeacademy.db.jdbc.manager.DbConnector;
import lt.codeacademy.db.jdbc.service.EmployeeService;

public class App {
    public static void main(String[] args) {
        DbConnector dbConnector = new DbConnector();

        new EmployeeService().getEmployee();
    }
}
