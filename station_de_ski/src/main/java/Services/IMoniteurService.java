package Services;

import entities.Moniteur;

import java.util.List;

public interface IMoniteurService  {


    void add(Moniteur m);

    void update(Moniteur m, Long id);

    List<Moniteur> getALL();

    Moniteur getById(Long id);

    void remove(Long id);
}
