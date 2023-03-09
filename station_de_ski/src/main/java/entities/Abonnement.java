package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Abonnement")
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long numAbon;
    private LocalDate dateDébut;
    private LocalDate dateFin;
    private Float prixAboon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

}
