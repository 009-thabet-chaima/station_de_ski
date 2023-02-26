package entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Abonnement")
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public Long numAbon;
    public LocalDate dateDébut;
    public LocalDate dateFin;
    public Float prixAboon;
    public TypeAbonnement typeAbon;

}
