package Repositories;

import entities.Inscription;
import entities.Skieur;
import entities.TypeAbonnement;
import entities.TypeCours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {


    static List<Skieur> findByAbonnementtypeAbon(TypeAbonnement typeAbonnement);

    List<Inscription>findByInscriptioncourstypeCours(TypeCours typeCours);


}