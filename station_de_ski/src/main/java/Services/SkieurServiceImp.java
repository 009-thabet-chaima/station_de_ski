package Services;

import Repositories.PisteRepository;
import Repositories.SkieurRepository;
import entities.Skieur;
import entities.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SkieurServiceImp implements ISkieurService{
    @Autowired
    private SkieurRepository iskieurRepository;
@Autowired
    private SkieurRepository skieurRepository;

    @Override
    public void add(Skieur C){

        iskieurRepository.save(C);
    }
    @Override
    public Skieur update(Skieur C,Long id){
        Skieur SkieurFromDb= skieurRepository.findById(id).orElse(null);
        SkieurFromDb.setNumSkieur(SkieurFromDb.getNumSkieur());
        SkieurFromDb.setInscriptions(SkieurFromDb.getInscriptions());
        SkieurFromDb.setAbonnement(SkieurFromDb.getAbonnement());
        SkieurFromDb.setDateNaissance(SkieurFromDb.getDateNaissance());
        SkieurFromDb.setNomS(SkieurFromDb.getNomS());
        SkieurFromDb.setPrenomS(SkieurFromDb.getPrenomS());
        SkieurFromDb.setVille(SkieurFromDb.getVille());
        return SkieurFromDb;
    }
    @Override
    public List<Skieur> getAll()   {
        return (List<Skieur>) iskieurRepository.findAll();     }
    @Override
    public Skieur getById(Long id) {
        return iskieurRepository.findById(id).orElse(null);}

    @Override
    public void remove(long id){
        iskieurRepository.deleteById(id);
    }

    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        return null;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
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
//Override
//   public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
////       return SkieurRepository.findByAbonnementtypeAbon(typeAbonnement);
//
  ////  }//

//}

}
