package lt.codeacademy.db.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "employee")
@ToString
@Builder
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for postgreSQL required
    private Long id;

    @Column(length = 30, nullable = false)  // mostly used when hibernate.hbm2ddl.auto not validate
    private String name;
}
