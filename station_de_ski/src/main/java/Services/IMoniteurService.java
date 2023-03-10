package Services;

import entities.Moniteur;

import java.util.List;

public interface IMoniteurService  {


    void add(Moniteur m);

    Moniteur update(Moniteur m, Long id);

    List<Moniteur> getALL();

    Moniteur getById(Long id);

    void remove(Long id);

    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
