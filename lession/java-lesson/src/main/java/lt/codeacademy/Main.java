package lt.codeacademy;

import java.sql.SQLException;



public class Main {
    public static void main(String[] args) throws SQLException {
        new MyDbLogic().editItem(8, "Jonas", new DbConnection());
    }
}
