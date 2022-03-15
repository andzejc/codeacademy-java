package lt.codeacademy.db.fisherman.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public final class DateUtils {

    private static final String DATE_PATTERN = "yyyy-MM-dd";

    public static Date toSqlDate(LocalDate date) {
        return Date.valueOf(date);
    }

    public static java.sql.Date toSqlDate(java.util.Date date) {
        return Date.valueOf(new SimpleDateFormat(DATE_PATTERN).format(date));
    }
}
