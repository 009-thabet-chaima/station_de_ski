package Services;

import entities.Piste;
import entities.Skieur;

import java.util.List;

public interface IPisteService {
    void add(Piste p);
    Piste update(Piste P);
    List<Piste> getAll();
    Piste getById(Long id);
    abstract Piste getById(long id);
    void remove(long id);

}
