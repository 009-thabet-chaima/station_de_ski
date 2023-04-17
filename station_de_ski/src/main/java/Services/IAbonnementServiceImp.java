package Services;
import Repositories.AbonnementRepository;
import entities.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.Abonnement;

import java.time.LocalDate;
import java.util.List;


@Service
public class IAbonnementServiceImp implements IAbonnementService{
    @Autowired
    private  AbonnementRepository abonnementRepository;
    @Override
    public Abonnement add(Abonnement A){

        return abonnementRepository.save(A);
    }
    @Override
    public Abonnement update(Abonnement A, Long id){
       Abonnement abonnement1  = abonnementRepository.findById(id).orElse(null);
        abonnement1.setDateDébut(abonnement1.getDateDébut());
        abonnement1.setDateFin(abonnement1.getDateFin());
        abonnement1.setNumAbon(abonnement1.getNumAbon());
        abonnement1.setPrixAboon(abonnement1.getPrixAboon());
        return abonnement1;
    }
    @Override
    public List<Abonnement> getAll()   {
        return (List<Abonnement>) abonnementRepository.findAll();
    }
    @Override
   public Abonnement getById(Long id) {
        return abonnementRepository.findById(id).orElse(null);
    }
    @Override
    public void remove(Long id){
        abonnementRepository.deleteById(id);
    }

    @Override
    //public List <Abonnement>findByTypeAbonnement(TypeAbonnement typeAbonnement){ }
    public List<Abonnement>getSubscriptionByType(TypeAbonnement typeabon){
        return abonnementRepository.findBytypeAbon(typeabon);
    }
    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate,LocalDate endDate){

        return abonnementRepository.findByDateDebutBetween(startDate,endDate);
    }

}







