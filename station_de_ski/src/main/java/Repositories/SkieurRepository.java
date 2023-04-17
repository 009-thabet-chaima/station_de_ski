package Repositories;

import entities.Inscription;
import entities.Skieur;
import entities.TypeAbonnement;
import entities.TypeCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {

     List<Skieur> findByAbonnementtypeAbon(TypeAbonnement typeAbonnement);
//@Query(value="select * from skieur s join abonnement a on ")

    List<Inscription>findByInscriptioncourstypeCours(TypeCours typeCours);

    //Keyword
    // List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
    //JPQL Query
    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1")
    List<Skieur> findByAbonnementTypeAbonJPQL(TypeAbonnement typeAbonnement);



    //Native SQL query of the same above method
    @Query(value = "SELECT * FROM skieurs s join abonnements a on s.abonnement_num_abon = a.num_abon " +
            "Where a.type_abonnement = :typeAbonnement", nativeQuery = true)
    List<Skieur> findByAbonnementTypeSQL(@Param("typeAbonnement") TypeAbonnement typeAbonnement);

    List<Skieur> findByInscriptionsCoursTypeCours(TypeCours typeCours);



    //SQL
    @Query(value = "select * from  skieurs s ORDER BY (SELECT COUNT(*) " +
            "from inscriptions i where i.skieur_num_skieur = s.num_skieur" , nativeQuery = true)
    List<Skieur> findSkieurOrderByNumInscriptionSQL();


    //JPQL
    @Query("select s from skieurs s order by s.inscriptions.size")
    List<Skieur> findSkieurOrderByNumInscriptionJPQL();

}