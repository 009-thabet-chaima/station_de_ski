package Services;

import entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
   void add(Abonnement A);
   Abonnement update(Abonnement A);
    List<Abonnement> getAll();
    Abonnement getById(Long id);
    abstract Abonnement getById(long id);
    void remove(long id);
}
