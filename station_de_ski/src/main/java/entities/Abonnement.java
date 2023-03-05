package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "Abonnement")
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long numAbon;
    private LocalDate dateDébut;
    private LocalDate dateFin;
    private Float prixAboon;
    private TypeAbonnement typeAbon;

}
