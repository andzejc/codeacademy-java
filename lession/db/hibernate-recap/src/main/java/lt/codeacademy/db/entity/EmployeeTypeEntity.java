package lt.codeacademy.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTypeEntity {

    @Id
    private Integer id;
    private String name;
}
