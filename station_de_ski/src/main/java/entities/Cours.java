package entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typecours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int creneau;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
    private List<Inscription> inscriptions;


}
