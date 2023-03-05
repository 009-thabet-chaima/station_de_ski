package Services;

import Repositories.PisteRepository;
import entities.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PisteServiceImp implements IPisteService{
    @Autowired
    private PisteRepository iPisteRepository;

    @Override
    //traitement qcq
    public void add(Piste C){
        iPisteRepository.save(C);
    }
    @Override
    public Piste update(Piste P){return iPisteRepository.save(P);}
    @Override
    public List<Piste> getAll()   { return (List<Piste>) iPisteRepository.findAll();     }
    @Override
    public entities.Piste getById(Long id) { return iPisteRepository.findById(id);}
    @Override
    public Piste getById(long id){ return iPisteRepository.findById(id);}
    @Override
    public void remove(long id){
        iPisteRepository.deleteById(id);
    }

}
