package lt.codeacademy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException {
    String userName = "postgres";
    String password = "postgres";
    String conectionUrl = "jdbc:postgresql://localhost:5432/postgres";
    Class.forName("org.postgresql.Driver");
    try (Connection connection = DriverManager.getConnection(conectionUrl, userName, password);
        Statement statement = connection.createStatement()) {
      statement.executeUpdate("INSERT INTO author(id, name) VALUES (5, 'Jonas')");
      ResultSet resultSet = statement.executeQuery("select * from author");
      while (resultSet.next()) {
        System.out.println(resultSet.getInt("id"));
        System.out.println(resultSet.getString("name"));
        System.out.println("--------------------------------");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
