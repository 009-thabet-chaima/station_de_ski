package entities;

import entities.Abonnement;
import entities.Inscription;
import entities.Piste;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Skieur")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    public Long numSkieur;
    public String nomS;
    public String prenomS;
    public LocalDate dateNaissance;
    public String ville;
   @OneToOne
   Abonnement abonnement;

@OneToMany
        (cascade = CascadeType.ALL,mappedBy = "skieur")
    private Set<Inscription>inscriptions;
@ManyToMany(mappedBy = "skieur",cascade = CascadeType.ALL)
    private Set<Piste>pistes;

}
