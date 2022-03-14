package lt.codeacademy.db.jdbc;

import lt.codeacademy.db.jdbc.utils.FileUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> properties = new FileUtil().readFrom("database.properties");

        try {
            Connection connection = DriverManager.getConnection(
                    properties.get(0).split("=")[1],
                    properties.get(1).split("=")[1],
                    properties.get(2).split("=")[1]);
        } catch (SQLException e) {
            throw new RuntimeException("Connection into database has a problem: " + e.getMessage());
        }
    }
}
