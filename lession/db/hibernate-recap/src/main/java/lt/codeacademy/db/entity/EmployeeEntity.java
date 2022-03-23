package lt.codeacademy.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
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

    @Column(length = 30, nullable = false)  // mostly used when hibernate.hbm2ddl.auto not validate
    private String name;

    @Column(length = 50, nullable = false)
    private String surname;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(length = 8, name = "phone_number")
    private String phoneNumber;

    @ManyToOne
    //optional
    @JoinColumn(name = "employee_type_id",
            columnDefinition = "int default 1",
            foreignKey = @ForeignKey(name = "employee_employee_type_id_to_employee_type_id_fkey"))
    private EmployeeTypeEntity employeeType;

    @ManyToMany
    private List<CityEntity> cities = new ArrayList<>();
}
