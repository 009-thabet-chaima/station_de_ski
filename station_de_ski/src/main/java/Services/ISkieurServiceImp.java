package Services;

import Repositories.PisteRepository;
import Repositories.SkieurRepository;
import entities.Abonnement;
import entities.Piste;
import entities.Skieur;
import entities.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ISkieurServiceImp implements ISkieurService{
    @Autowired
    private PisteRepository pisteRepository;
@Autowired
    private SkieurRepository skieurRepository;

    @Override
    public void add(Skieur C){

        skieurRepository.save(C);
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
        return (List<Skieur>) skieurRepository.findAll();     }
    @Override
    public Skieur getById(Long id) {
        return skieurRepository.findById(id).orElse(null);}

    @Override

    public void remove(Long id){
        skieurRepository.deleteById(id);
    }
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {

 Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
 Assert.notNull(skieur,"skieur not found ");

 Piste piste = pisteRepository.findById(numSkieur).orElse(null);
 Assert.notNull(skieur,"piste not found ");
 //traitement
 //List<Piste> pistes=skieur.getPistes();
 //pistes.add(piste);
 //skieur.setPistes(pistes);
 //skieur.getPistes().add(piste);
 return skieurRepository.save(skieur);

    //    if(skieurRepository.existsById(numSkieur) && pisteRepository.existsById(numPiste)){
    //        Skieur s= skieurRepository.findById(numSkieur).get();
    //        s.addPiste(pisteRepository.findById(numPiste).get());
    //        return s;
    //    }
    //    return null;
    }
    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {
        //Créer Abonnement
        Abonnement a = skieur.getAbonnement();
        if(a != null && skieur.getInscriptions() != null){
          //  abonnementRepository.save(a);
          //  inscriptionRepository.saveAll(skieur.getInscriptions());
            return skieurRepository.save(skieur);}
        return null;
    }
    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return null;
    }
    //  @Override
 //      public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
 //          return SkieurRepository.findByAbonnementtypeAbon(typeAbonnement);
 //}
    //return getAll().stream().filter(skieur -> skieur.getAbonnement().getTypeAbon()== typeAbonnement).collect(Collectors.toList());
    //   return skieurRepository.findByAbonnementTypeAbonJPQL(  //return getAll().stream().filter(skieur -> skieur.getAbonnement().getTypeAbon()== typeAbonnement).collect(Collectors.toList());
            //           return skieurRepository.findByAbonnementTypeAbonJPQL(typeAbonnement);}


    @Override
    @Transactional
    public Skieur assignSkieurToAbon(Long numSkieur, Long numAbon) {
      //  if(skieurRepository.existsById(numSkieur) && abonnementRepository.existsById(numAbon))
        {
            Skieur s = skieurRepository.findById(numSkieur).get();
          //  s.setAbonnement(abonnementRepository.findById(numAbon).get());
            return s;
        }
       // return null;
    }
}