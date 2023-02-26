package entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long numCours;
    public int niveau;
    public TypeCours typeCours;
    public Support support;
    public Float prix;
    public int creneau;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
    private Set<Inscription>inscriptions;


}
