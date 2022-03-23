package lt.codeacademy.db.entity.report;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Subselect("SELECT e.id, e.name, e.phone_number, c.city_name FROM employee e " +
        "LEFT JOIN employee_city ec on e.id = ec.employees_id " +
        "LEFT JOIN city c on ec.cities_id = c.id " +
        "WHERE c.id IS NOT NULL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeCitiesReport {

    @Id
    @Column(name = "id")
    private Long employeeId;

    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city_name")
    private String cityName;

}
