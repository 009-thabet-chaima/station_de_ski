package Repositories;

import entities.Inscription;
import entities.Skieur;
import entities.TypeAbonnement;
import entities.TypeCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {

     List<Skieur> findByAbonnementtypeAbon(TypeAbonnement typeAbonnement);
//@Query(value="select * from skieur s join abonnement a on ")

    List<Inscription>findByInscriptioncourstypeCours(TypeCours typeCours);


}