package Services;

import Repositories.CoursRepository;
import Repositories.MoniteurRepository;
import entities.Moniteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void update(Moniteur m, Long id){
        Moniteur MoniteurFromDB = moniteurRepository.findById(id).orElse(null);
        MoniteurFromDB.setCours(MoniteurFromDB.getCours());
        MoniteurFromDB.setNumMoniteur(MoniteurFromDB.getNumMoniteur());
        MoniteurFromDB.setNomM(MoniteurFromDB.getNomM());
        MoniteurFromDB.setPrenomM(MoniteurFromDB.getPrenomM());
        MoniteurFromDB.setDateRecru(MoniteurFromDB.getDateRecru());
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


}
