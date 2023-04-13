package Repositories;

import entities.Abonnement;
import entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {

    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);

    List<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);

    List<Abonnement> findBytypeAbon(TypeAbonnement typeabon);
}