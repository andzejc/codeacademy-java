package lt.codeacademy.db.jdbc.service;

import lt.codeacademy.db.jdbc.entity.Employee;
import lt.codeacademy.db.jdbc.manager.DbConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static Connection connection = new DbConnector().get();

    public List<Employee> getEmployee() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM paskaita5.employee");
            List<Employee> employees = new ArrayList<>();
            while (resultSet.next()) {
                employees.add(Employee.builder()
                                .id(resultSet.getLong("id"))
                                .name(resultSet.getString("name"))
                                // TODO:



                        .build());
            }
            employees.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
