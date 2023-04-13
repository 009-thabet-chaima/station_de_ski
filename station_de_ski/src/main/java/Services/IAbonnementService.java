package Services;

import entities.Abonnement;
import entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IAbonnementService {
   Abonnement add(Abonnement A);
    Abonnement update(Abonnement A, Long id);

    List<Abonnement> getAll();
   Abonnement getById(Long id);
    void remove(Long id);

    List <Abonnement>findByTypeAbonnement(TypeAbonnement typeAbonnement);

    //public List <Abonnement>findByTypeAbonnement(TypeAbonnement typeAbonnement){ }
    List<Abonnement>getSubscriptionByType(TypeAbonnement typeabon);

    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate,

                                                  LocalDate endDate);
}
