package entities;


import javax.persistence.*;

@Entity
@Table(name = "inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long numinscription;
    public int numSemaine;

@ManyToOne
Cours cours;

@ManyToOne
Skieur skieur;



}
