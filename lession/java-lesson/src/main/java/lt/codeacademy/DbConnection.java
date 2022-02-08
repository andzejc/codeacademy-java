package lt.codeacademy;

import java.sql.SQLException;

public class DbConnection implements DbConnectionInt {

  @Override
  public String find(int id) {
    System.out.println("find id: " + id);
    if (id < 100) {
      return "Justas test";
    }
    return null;
  }

  @Override
  public int save(int id, String name) throws SQLException {
    if (id < 100) {
      System.out.println("save id: " + id + " Name: " + name);
      return 1;
    } else throw new SQLException("Sql error, id not found");
  }
}
