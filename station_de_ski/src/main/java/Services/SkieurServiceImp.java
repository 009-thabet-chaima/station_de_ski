package Services;

import Repositories.PisteRepository;
import Repositories.SkieurRepository;
import entities.Skieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkieurServiceImp implements ISkieurService{
    @Autowired
    private SkieurRepository iskieurRepository;
@Autowired
    private PisteRepository pisteRepository;

    @Override
    //traitement qcq
    public void add(Skieur C){
        iskieurRepository.save(C);
    }
    @Override
    public Skieur update(Skieur C){return iskieurRepository.save(C);}
    @Override
    public List<Skieur> getAll()   { return (List<Skieur>) iskieurRepository.findAll();     }
    @Override
    public entities.Skieur getById(Long id) { return iskieurRepository.findById(id);}
    @Override
    public Skieur getById(long id){ return iskieurRepository.findById(id);}
    @Override
    public void remove(long id){
        iskieurRepository.deleteById(id);
    }

    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        return null;
    }
  // Piste piste = pisteRepository.findAll(numSkieur).orElse(othernull);
  // Assert.notNull(Piste,message"Piste not found ");
  // Skieur skieur = iskieurRepository.findAll(numSkieur).orElse(othernull);
  //     Assert.notNull(skieur,message"skieur not found ");

  // //traitement
  // Liste<Piste>pistes=skieur.getPiste();
  // pistes.add(piste);
  // skieur.setPiste(pistes);
  // skieurRepository.save(skieur);
  // return skieur;



}
