package lt.codeacademy.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class EmployeeEntity {

    @Id
    private Long id;
}
