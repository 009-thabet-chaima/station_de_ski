package Services;

import Repositories.InscriptionRepository;
import entities.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InscriptionServiceImp implements IInscriptionService{
    //injection de dependence
    @Autowired
    private InscriptionRepository iInscriptionRepository;
    @Override
    //traitement qcq
    public void add(Inscription I){
        iInscriptionRepository.save(I);
    }
    @Override
        public Inscription  update(Inscription I,Long id ){
     Inscription InscriFromDB = iInscriptionRepository.findById(id).orElse(null);
     InscriFromDB.setNuminscription(InscriFromDB.getNuminscription());
     InscriFromDB.setNumSemaine(InscriFromDB.getNumSemaine());
     InscriFromDB.setSkieur(InscriFromDB.getSkieur());
     InscriFromDB.setCours(InscriFromDB.getCours());
    return InscriFromDB;
    }
    @Override
    public List<Inscription> getAll()   {
        return (List<Inscription>) iInscriptionRepository.findAll();     }
    @Override
    public Inscription getById(Long id) {
        return iInscriptionRepository.findById(id).orElse(null);}
    @Override
    public void remove(Long id){
        iInscriptionRepository.deleteById(id);
    }

}
