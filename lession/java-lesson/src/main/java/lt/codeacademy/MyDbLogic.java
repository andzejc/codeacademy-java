package lt.codeacademy;

import java.sql.SQLException;

public class MyDbLogic {
  public int editItem(int id, String newName, DbConnectionInt db) throws SQLException {
    System.out.println("edit item: " + id);
    String itemName = db.find(id);
    if (itemName != null) {
      itemName = newName;
      int response = db.save(id, itemName);
      if (response == 2) {
        System.out.println("Response = 2!");
      }
    } else {
      throw new IllegalArgumentException("record with id: " + id + "didn't save");
    }
    return 1;
  }
}
