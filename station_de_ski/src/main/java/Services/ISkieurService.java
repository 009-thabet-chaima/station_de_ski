package Services;

import entities.Piste;
import entities.Skieur;
import entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    void add(Skieur s);
    Skieur update(Skieur S,Long id);
    List<Skieur> getAll();
    Skieur getById(Long id);
    void remove(Long id);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur assignSkieurToAbon(Long numSkieur, Long numAbon);

    Skieur addSkierAndAssignToCourse(Skieur skieur);

    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
