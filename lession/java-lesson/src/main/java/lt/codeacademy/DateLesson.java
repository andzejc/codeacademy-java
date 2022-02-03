package lt.codeacademy;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateLesson {

  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    System.out.println(ZonedDateTime.now());
    System.out.println("--------------------");
    LocalDate date1 = LocalDate.of(2020, 6, 14);
    LocalDate date2 = LocalDate.of(2020, Month.APRIL, 14);
    System.out.println(date1);
    System.out.println(date2);
    System.out.println("-------------------");
    LocalTime time1 = LocalTime.of(21, 2);
    LocalTime time2 = LocalTime.of(21, 2, 30);
    LocalTime time3 = LocalTime.of(21, 2, 30, 44);
    System.out.println(time1 + "\n" + time2 + "\n" + time3);
    System.out.println("--------------------");
    LocalDateTime localDateTime1 = LocalDateTime.of(date1, time1);
    LocalDateTime localDateTime2 = LocalDateTime.of(2020, Month.DECEMBER, 30, 12, 22);
    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println("----------------------------");
    Date date;
    Calendar calendar = Calendar.getInstance();
    calendar.set(2021, Calendar.JANUARY, 2);
    date = calendar.getTime();
    System.out.println(date);
    System.out.println("------------------------");
    System.out.println(date2);
    System.out.println(date2.plusDays(4));
    System.out.println(date2.minusYears(2));
    System.out.println("----------------");
    LocalDate date4 = LocalDate.of(2022, Month.FEBRUARY, 22).plusDays(3).minusYears(2).minusMonths(2);
    System.out.println(date4);
    date4 = date4.plusDays(3);
    System.out.println(date4);
    System.out.println("---------------");
    LocalDate startDate = LocalDate.of(2022, Month.JANUARY, 1);
    LocalDate endDate = LocalDate.of(2022, Month.DECEMBER, 31);
    System.out.println("----------------------");
    Period period = Period.ofDays(1);
    tvarkytiMasina(startDate, endDate, period);
    System.out.println("-----------------");
    LocalDate localDate = LocalDate.of(2022, 12, 22);
    System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

  }

  private static void tvarkytiMasina(LocalDate start, LocalDate end, Period period) {
    LocalDate tvarkymoDiena = start;
    LocalTime t = LocalTime.of(11, 10);
    Duration duration = Duration.ofHours(12);
    System.out.println(t.plus(duration));
    while (tvarkymoDiena.isEqual(start)) {
      System.out.println(" vaziuok i servisa: " + tvarkymoDiena);
      tvarkymoDiena = tvarkymoDiena.plus(period);
    }

  }
}
