package Services;

import entities.Skieur;

import java.util.List;

public interface ISkieurService {
    void add(Skieur s);
    Skieur update(Skieur S);
    List<Skieur> getAll();
    Skieur getById(Long id);
    abstract Skieur getById(long id);
    void remove(long id);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

}
