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
    public void add(Piste C){

        iPisteRepository.save(C);
    }
    @Override
    public Piste update(Piste P,Long id){
        Piste PisteFromDb = iPisteRepository.findById(id).orElse(null);
        PisteFromDb.setNomPiste(PisteFromDb.getNomPiste());
        PisteFromDb.setNumPiste(PisteFromDb.getNumPiste());
        PisteFromDb.setPente(PisteFromDb.getPente());
        PisteFromDb.setCouleur(PisteFromDb.getCouleur());
        PisteFromDb.setLongeur(PisteFromDb.getLongeur());
    return PisteFromDb;
    }
    @Override
    public List<Piste> getAll()   {
        return (List<Piste>) iPisteRepository.findAll();     }
    @Override
    public Piste getById(Long id){
        return iPisteRepository.findById(id).orElse(null);}
    @Override
    public void remove(Long id){

        iPisteRepository.deleteById(id);
    }

}
