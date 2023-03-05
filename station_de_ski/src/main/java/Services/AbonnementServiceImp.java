package Services;
import Repositories.AbonnementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.Abonnement;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor

public class AbonnementServiceImp implements IAbonnementService{
    //injection de dependence
    @Autowired
    private final AbonnementRepository abonnementRepository;
    @Override
    //traitement qcq
    public void add(Abonnement A){
        abonnementRepository.save(A);
    }
    @Override
    public Abonnement update(Abonnement A){return abonnementRepository.save(A);}
    @Override
    public List<Abonnement> getAll()   { return (List<Abonnement>) abonnementRepository.findAll();     }
    @Override
   public Optional<Abonnement> getById(long id) { return abonnementRepository.findById(id);}
    @Override
    public void remove(long id){
        abonnementRepository.deleteById(id);
    }

    @Override
    public Abonnement getById(Long id) {
        return null;
    }

}







