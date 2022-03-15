package lt.codeacademy.db.jdbc.utils;

import java.time.LocalDate;
import java.sql.Date;

public final class DateUtils {

    public static Date toSqlDate(LocalDate date) {
        return Date.valueOf(date);
    }
}
