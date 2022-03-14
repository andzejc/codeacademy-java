package lt.codeacademy.db.jdbc;

import lt.codeacademy.db.jdbc.utils.FileUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        /**
         * Alternative usage
         */
/*        try {
            InputStream inuStream = App.class.getClassLoader().getResourceAsStream("database.properties");
            Properties props = new Properties();
            props.load(inuStream);
            String url = props.getProperty("database.jdbc.url");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        List<String> properties = new FileUtil().readFrom("database.properties");

        try {
            Connection connection = DriverManager.getConnection(
                    properties.get(0).split("=")[1],
                    properties.get(1).split("=")[1],
                    System.getProperty("db.postgres.pass"));
        } catch (SQLException e) {
            throw new RuntimeException("Connection into database has a problem: " + e.getMessage());
        }
    }
}
