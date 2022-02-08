package lt.codeacademy;

import java.sql.SQLException;

public interface DbConnectionInt {
    public String find(int id);
    public int save(int id, String name) throws SQLException;
}
