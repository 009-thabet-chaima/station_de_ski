package Repositories;

import entities.Abonnement;
import entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {

    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);

    @Query("select a from abonnements a where a.typeAbon = ?1")

    List<Abonnement> findBytypeAbon(TypeAbonnement typeabon);
    List<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);




}