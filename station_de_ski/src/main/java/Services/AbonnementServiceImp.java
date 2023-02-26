package Services;
import Repositories.IAbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.Abonnement;
import java.util.ArrayList;
import java.util.List;
@Service
public class AbonnementServiceImp implements IAbonnementService{
    //injection de dependence
  //List<Abonnement> abonnements=new ArrayList<Abonnement>();
    @Autowired
    private  IAbonnementRepository abonnementRepository;
    @Override
    //traitement qcq
    public void add(Abonnement A){
        IAbonnementRepository.save(A);
    }
    @Override
    public Abonnement update(Abonnement A){return IAbonnementRepository.save(A);}
    @Override
    public List<Abonnement> getAll()   {        return  abonnementRepository.findAll();     }
   @Override
    public entities.Abonnement getById(Long id) { return IAbonnementRepository.findById(id);}
    @Override
   public Abonnement getById(long id){ return IAbonnementRepository.findById(id);}
    @Override
    public void remove(long id){
        IAbonnementRepository.deletById(id);
    }
}







