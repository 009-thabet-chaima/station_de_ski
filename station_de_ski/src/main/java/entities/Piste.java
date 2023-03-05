package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Piste")
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longeur;
    private int pente;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur>skieurs;
}
