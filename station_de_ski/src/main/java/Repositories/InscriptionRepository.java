package Repositories;

import entities.Inscription;
import entities.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

    @Query("select i from Inscription i where i.cours.support = ?1")
    List<Inscription> findByCours_Support(Support support);
}
