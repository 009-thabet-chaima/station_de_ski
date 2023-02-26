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
    public Long numMoniteur;
    public String nomM;
    public String prenomM;
    public LocalDate dateRecru;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;

}
