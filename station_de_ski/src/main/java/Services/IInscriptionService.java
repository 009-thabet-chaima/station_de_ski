package Services;

import entities.Abonnement;
import entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    void add(Inscription I);
    Inscription update(Inscription I);
    List<Inscription> getAll();
    Inscription getById(Long id);
    abstract Inscription getById(long id);
    void remove(long id);

}
