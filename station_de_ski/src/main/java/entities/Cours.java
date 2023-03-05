package entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    private TypeCours typeCours;
    private Support support;
    private Float prix;
    private int creneau;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cours")
    private Set<Inscription>inscriptions;


}
