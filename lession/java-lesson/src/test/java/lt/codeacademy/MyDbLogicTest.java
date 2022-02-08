package lt.codeacademy;

import org.jmock.Expectations;
import org.jmock.Mockery;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class MyDbLogicTest {

    Mockery content = new Mockery();

    @org.junit.Test
    public void editItem() throws SQLException {
        int id = 5;
        String newName = "Andrius";
        DbConnectionInt db = content.mock(DbConnectionInt.class);
        content.checking(new Expectations(){{
            oneOf(db).find(id);
            oneOf(db).save(id, newName);will(returnValue(2));
        }});
        MyDbLogic myDbLogic = new MyDbLogic();
        int expResult = 1;
        int result = myDbLogic.editItem(id, newName, db);
        assertEquals(expResult, result);
    }
}