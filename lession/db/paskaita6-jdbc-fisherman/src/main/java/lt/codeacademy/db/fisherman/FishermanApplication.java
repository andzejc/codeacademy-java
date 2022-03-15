package lt.codeacademy.db.fisherman;

import lt.codeacademy.db.fisherman.service.FakerDataInitializer;

import java.sql.SQLException;

public class FishermanApplication {

    public FishermanApplication() {
        initFakerDataToDb();
        doUpdateFish();
    }

    private void initFakerDataToDb() {
        try {
            new FakerDataInitializer();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    private void doUpdateFish() {
//        new FishService(connection).saveOrUpdate();
    }
}
