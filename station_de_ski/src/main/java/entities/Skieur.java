package entities;

import entities.Abonnement;
import entities.Inscription;
import entities.Piste;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Skieur")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

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
@ManyToMany(mappedBy = "skieurs",cascade = CascadeType.ALL)
    private List<Piste> pistes;

}
