package lt.codeacademy.db.jdbc.service;

import lt.codeacademy.db.jdbc.entity.Employee;
import lt.codeacademy.db.jdbc.manager.DbConnector;
import lt.codeacademy.db.jdbc.utils.DateUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static Connection connection = new DbConnector().get();

    public List<Employee> getEmployee() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM paskaita5.employee");
            printData(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private void printData(ResultSet resultSet) throws SQLException {
        List<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            employees.add(Employee.builder()
                            .id(resultSet.getLong("id"))
                            .name(resultSet.getString("name"))
                            .salary(resultSet.getBigDecimal("salary"))
                            .employmentDate(resultSet.getDate("employment_date"))
                            .surname(resultSet.getString("surname"))
                            .jobTitle(resultSet.getString("job_title"))
                            .personalCode(resultSet.getString("personal_code"))
                    .build());
        }
        employees.forEach(System.out::println);
    }

    public void changeEmployeeNameById(Long id, String name) throws SQLException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement statement = connection
                    .prepareStatement("UPDATE paskaita5.employee SET name = ? WHERE id = ?");
            statement.setString(1, name);
            statement.setLong(2, id);
            int result = statement.executeUpdate();

            statement = connection
                    .prepareStatement("UPDATE paskaita5.employee SET name = ? WHERE id = ?");
            statement.setString(1, name + "a");
            statement.setLong(2, id);

            result = statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw new SQLException(e);
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public List<Employee> findEmployeeByDate(LocalDate date) {
        try {
            PreparedStatement statement = connection
                    .prepareStatement("SELECT * FROM paskaita5.employee WHERE employment_date >= ?");
            statement.setDate(1, DateUtils.toSqlDate(date));

            ResultSet resultSet = statement.executeQuery();
            printData(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
