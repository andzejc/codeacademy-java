package lt.codeacademy.db.jdbc;

import lt.codeacademy.db.jdbc.manager.DbConnector;
import lt.codeacademy.db.jdbc.service.EmployeeService;

import java.sql.SQLException;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        DbConnector dbConnector = new DbConnector();

//        new EmployeeService().findEmployeeByDate(LocalDate.of(2022, 01, 01));
        try {
            new EmployeeService().changeEmployeeNameById(1L, "Saulius");
            new EmployeeService().getEmployee();
        } catch (SQLException e) {
            throw new RuntimeException("Ivyko DB klaida: " + e.getMessage());
        }
    }
}
