package lt.codeacademy.db.fisherman.service;

import lt.codeacademy.db.fisherman.entity.Fish;
import lt.codeacademy.db.fisherman.entity.Fisherman;
import lt.codeacademy.db.fisherman.faker.FakerDataBuilder;
import lt.codeacademy.db.fisherman.utils.DateUtils;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class FakerDataInitializer extends DBService {

    public FakerDataInitializer() throws SQLException {
        super();
        try {
            DB.setAutoCommit(false);

            FakerDataBuilder.genFishermanList().forEach(this::insertFishermanData);
            FakerDataBuilder.genFishList().forEach(this::insertFishData);
            DB.commit();
        } catch (SQLException e) {
            DB.rollback();
            throw new SQLException(e);
        } finally {
            DB.setAutoCommit(true);
        }
    }

    private void insertFishData(Fish fish) {
        //TODO: same as insertFishermanData
        System.out.println(fish.toString());
    }

    private void insertFishermanData(Fisherman fisherman) {
        PreparedStatement statement;
        try {
            statement = DB.prepareStatement(
                    "insert into fisherman.fisherman(id, name, surname, age, rod, hook_size_id, start_fishing_date) " +
                            "values (?, ?, ?, ?, ?, ?, ?);");
            statement.setLong(1, fisherman.getId());
            statement.setString(2, fisherman.getName());
            statement.setString(3, fisherman.getSurname());
            statement.setLong(4, fisherman.getAge());
            statement.setString(5, fisherman.getRod());
            statement.setLong(6, fisherman.getHookSize().getIdx());
            statement.setDate(7, DateUtils.toSqlDate(fisherman.getStartFishingDate()));
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
