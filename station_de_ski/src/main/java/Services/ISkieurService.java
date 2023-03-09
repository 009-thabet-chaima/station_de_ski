package Services;

import entities.Skieur;
import entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    void add(Skieur s);
    Skieur update(Skieur S,Long id);
    List<Skieur> getAll();
    Skieur getById(Long id);
    void remove(long id);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

    // //traitement
    // Liste<Piste>pistes=skieur.getPiste();
    // pistes.add(piste);
    // skieur.setPiste(pistes);
    // skieurRepository.save(skieur);
    // return skieur;
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
