package lt.codeacademy.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "employee")
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for postgreSQL required
    private Long id;
    private String name;
    private String surname;
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @JoinColumn(name = "employee_type_id")
    @ManyToOne
    private EmployeeTypeEntity employeeType;

    @ManyToMany
    private List<CityEntity> cities = new ArrayList<>();
}
