package Services;

import entities.Piste;
import entities.Skieur;

import java.util.List;

public interface IPisteService {
    void add(Piste p);
    Piste update(Piste P,Long id);
    List<Piste> getAll();
     Piste getById(Long id);
    void remove(Long id);

    Piste assignPisteToskieur(Long numSieur, Long numPiste);
}
