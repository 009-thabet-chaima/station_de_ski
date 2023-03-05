package Services;

import entities.Abonnement;

import java.util.List;
import java.util.Optional;

public interface IAbonnementService {
   void add(Abonnement A);
   Abonnement update(Abonnement A);
    List<Abonnement> getAll();
    Optional<Abonnement> getById(long id);
    //abstract Abonnement getById(long id);
    void remove(long id);
}
