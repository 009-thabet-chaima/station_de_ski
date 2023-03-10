package Services;

import Repositories.PisteRepository;
import Repositories.SkieurRepository;
import entities.Piste;
import entities.Skieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
@Service

public class PisteServiceImp implements IPisteService{
    @Autowired
    private PisteRepository pisteRepository;
    @Autowired
    private SkieurRepository skieurRepository;

    @Override
    public void add(Piste C){

        pisteRepository.save(C);
    }
    @Override
    public Piste update(Piste P,Long id){
        Piste PisteFromDb = pisteRepository.findById(id).orElse(null);
        PisteFromDb.setNomPiste(PisteFromDb.getNomPiste());
        PisteFromDb.setNumPiste(PisteFromDb.getNumPiste());
        PisteFromDb.setPente(PisteFromDb.getPente());
        PisteFromDb.setCouleur(PisteFromDb.getCouleur());
        PisteFromDb.setLongeur(PisteFromDb.getLongeur());
    return PisteFromDb;
    }
    @Override
    public List<Piste> getAll()   {
        return (List<Piste>) pisteRepository.findAll();     }
    @Override
    public Piste getById(Long id){
        return pisteRepository.findById(id).orElse(null);}
    @Override
    public void remove(Long id){

        pisteRepository.deleteById(id);
    }
    @Override
public Piste assignPisteToskieur(Long numSieur, Long numPiste)
    {
        Skieur skieur = skieurRepository.findById(numSieur).orElse(null);
        Assert.notNull(skieur,"skieur not found");

        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste,"piste not found");

        List<Skieur>skieurs = piste.getSkieurs();
        skieurs.add(skieur);
        piste.setSkieurs(skieurs);
        piste.getSkieurs().add(skieur);

        return pisteRepository.save(piste);




    }

}
