package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "darbuotojai")
public class Darbuotojas {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long darbuotojo_id;
    private String vardas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "darbuotojas")
//    @JoinColumn(name = "irankio_id")
    private List<Irankis> irankis;

}
