package lt.codeacademy.db.fisherman.service;

import lt.codeacademy.db.fisherman.manager.DbConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//TODO: make initialize setup-db by configuration
public abstract class DBService {

    protected static final Connection DB = DbConnector.get();

    public DBService() {
        if (DbConnector.getDbProps().isRemoveDataWhenInit()) {
            removeDataBeforeInitialize();
        }
    }

    private void removeDataBeforeInitialize() {
        Statement statement;
        try{
            statement = DB.createStatement();
            statement.execute("TRUNCATE TABLE fisherman.fisherman CASCADE");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
