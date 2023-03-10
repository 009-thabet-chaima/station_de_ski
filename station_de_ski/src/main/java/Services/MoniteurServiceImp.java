package Services;

import Repositories.CoursRepository;
import Repositories.MoniteurRepository;
import entities.Cours;
import entities.Moniteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MoniteurServiceImp implements IMoniteurService{
    @Autowired
    MoniteurRepository moniteurRepository;
    @Autowired
    CoursRepository coursRepository;
    @Override
    public void add(Moniteur m){
        moniteurRepository.save(m);
    }
    @Override
    public Moniteur update(Moniteur m, Long id){
        Moniteur MoniteurFromDB = moniteurRepository.findById(id).orElse(null);
        MoniteurFromDB.setCours(MoniteurFromDB.getCours());
        MoniteurFromDB.setNumMoniteur(MoniteurFromDB.getNumMoniteur());
        MoniteurFromDB.setNomM(MoniteurFromDB.getNomM());
        MoniteurFromDB.setPrenomM(MoniteurFromDB.getPrenomM());
        MoniteurFromDB.setDateRecru(MoniteurFromDB.getDateRecru());
    return MoniteurFromDB;
    }
    @Override
    public List<Moniteur> getALL(){

        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur getById(Long id){
        return moniteurRepository.findById(id).orElse(null);

    }
    @Override
    public void remove(Long id){
        moniteurRepository.deleteById(id);
    }
@Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur,Long numCourse){
        List<Cours>courses = new ArrayList<>();
        Moniteur moniteur1 = new Moniteur();
        moniteur1.setNomM("John");
        moniteur1.setPrenomM("green");
        moniteur1.setDateRecru(LocalDate.parse("2023-03-02"));
        moniteur1.setNumMoniteur(254L);
        moniteur1.setCours(courses);
        add(moniteur1);


        Cours cours = coursRepository.findById(numCourse).orElse(null);
    Assert.notNull(cours,"cours not found");
    List <Cours>cours1 = moniteur1.getCours();

    cours1.add(cours);
    moniteur1.setCours(cours1);
    moniteur1.getCours().add(cours);

    return moniteurRepository.save(moniteur);



}

}
