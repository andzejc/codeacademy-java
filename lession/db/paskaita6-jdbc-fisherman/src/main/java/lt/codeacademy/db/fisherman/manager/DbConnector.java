package lt.codeacademy.db.fisherman.manager;

import lt.codeacademy.db.fisherman.utils.DbProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbConnector {

    private static final DbProperties DB_PROPS = new DbProperties();

    public static Connection get() {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_PROPS.getProperty("database.jdbc.url"),
                    DB_PROPS.getProperty("database.jdbc.user"),
                    DB_PROPS.getProperty("database.jdbc.pass"));

            if (connection != null) {
                System.out.println("Connection into DB success!!");
            }

            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Connection into database has a problem: " + e.getMessage());
        }
    }

    public static DbProperties getDbProps() {
        return DB_PROPS;
    }
}
