package Services;

import entities.Abonnement;

import java.util.List;
import java.util.Optional;

public interface IAbonnementService {
   Abonnement add(Abonnement A);
    Abonnement update(Abonnement A, Long id);

    List<Abonnement> getAll();
   Abonnement getById(Long id);
    void remove(Long id);
}
