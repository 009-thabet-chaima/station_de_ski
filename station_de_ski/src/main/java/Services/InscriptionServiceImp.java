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
    public Inscription update(Inscription I){return iInscriptionRepository.save(I);}
    @Override
    public List<Inscription> getAll()   { return (List<Inscription>) iInscriptionRepository.findAll();     }
    @Override
    public entities.Inscription getById(Long id) { return iInscriptionRepository.findById(id);}
    @Override
    public Inscription getById(long id){ return iInscriptionRepository.findById(id);}
    @Override
    public void remove(long id){
        iInscriptionRepository.deleteById(id);
    }

}
