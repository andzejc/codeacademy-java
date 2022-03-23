package lt.codeacademy.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
        name = "employee_type",
        // optional
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"name"},
                        name="employee_type_key"
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTypeEntity {

    @Id
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;
}
