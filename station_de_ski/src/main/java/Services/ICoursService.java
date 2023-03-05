package Services;

import entities.Abonnement;
import entities.Cours;

import java.util.List;

public interface ICoursService {
    void add(Cours c);
    Cours update(Cours A);
    List<Cours> getAll();
    Cours getById(Long id);
    //abstract Cours getById(long id);
    void remove(long id);
}
