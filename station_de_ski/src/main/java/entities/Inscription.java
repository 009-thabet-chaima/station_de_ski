package entities;


import javax.persistence.*;

@Entity
@Table(name = "inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numinscription;
    private int numSemaine;

@ManyToOne
Cours cours;

@ManyToOne
Skieur skieur;



}
