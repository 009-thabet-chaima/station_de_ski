package entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
   @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
   Abonnement abonnement;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "skieur")
    private List<Inscription>inscriptions;
@ManyToMany(cascade = CascadeType.ALL,mappedBy = "skieurs")
    private List<Piste> pistes;

}
