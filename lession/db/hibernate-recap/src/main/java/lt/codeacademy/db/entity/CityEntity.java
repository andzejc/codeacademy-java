package lt.codeacademy.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Table(name = "city")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityEntity {

    @Id
    private Long id;

    @Column(length = 20, nullable = false, name = "city_name")
    private String cityName;

    @ManyToMany(mappedBy = "cities")
    private List<EmployeeEntity> employees = new ArrayList<>();
}
