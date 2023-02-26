package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Piste")
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long numPiste;
    public String nomPiste;
    public Couleur couleur;
    public int longeur;
    public int pente;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur>skieurs;
}
