package entities;

import entities.Cours;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Moniteur")

public class Moniteur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;

}
