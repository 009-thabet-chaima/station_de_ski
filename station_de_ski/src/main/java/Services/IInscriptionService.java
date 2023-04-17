package Services;

import entities.Abonnement;
import entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    void add(Inscription I);
    Inscription update(Inscription I,Long id);
    List<Inscription> getAll();
    Inscription getById(Long id);
    void remove(Long id);
    Inscription addRegistrationAndAssignToSkierAndCours(Inscription inscription,Long numSkieur,Long numCours);


}
