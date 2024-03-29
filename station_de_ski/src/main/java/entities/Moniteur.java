package entities;

import entities.Cours;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Moniteur")

public class Moniteur implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate DateRecru;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cours> cours;

}
