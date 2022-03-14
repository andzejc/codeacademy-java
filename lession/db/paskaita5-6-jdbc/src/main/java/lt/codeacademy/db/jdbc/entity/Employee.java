package lt.codeacademy.db.jdbc.entity;

import lombok.Builder;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Date;

@Builder
@ToString
public class Employee {

    private final Long id;
    private final String personalCode;
    private final String name;
    private final String surname;
    private final String jobTitle;
    private final Date employmentDate;
    private final BigDecimal salary;

}
