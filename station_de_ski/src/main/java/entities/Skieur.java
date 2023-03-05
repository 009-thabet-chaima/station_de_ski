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


    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
   @OneToOne
   Abonnement abonnement;

@OneToMany
        (cascade = CascadeType.ALL,mappedBy = "skieur")
    private Set<Inscription>inscriptions;
@ManyToMany(mappedBy = "skieur",cascade = CascadeType.ALL)
    private Set<Piste>pistes;

}
