package Services;

import Repositories.CoursRepository;
import Repositories.InscriptionRepository;
import Repositories.SkieurRepository;
import entities.Cours;
import entities.Inscription;
import entities.Skieur;
import entities.TypeCours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
@Service
public class IInscriptionServiceImp implements IInscriptionService{
    //injection de dependence
    @Autowired
    private InscriptionRepository iInscriptionRepository;
    @Autowired
    private CoursRepository coursRepository;
    @Autowired private SkieurRepository skieurRepository;
    @Override
    public void add(Inscription I){
        iInscriptionRepository.save(I);
    }
    @Override
    public Inscription  update(Inscription I,Long id ){
     Inscription InscriFromDB = iInscriptionRepository.findById(id).orElse(null);
     InscriFromDB.setNuminscription(InscriFromDB.getNuminscription());
     InscriFromDB.setNumSemaine(InscriFromDB.getNumSemaine());
     InscriFromDB.setSkieur(InscriFromDB.getSkieur());
     InscriFromDB.setCours(InscriFromDB.getCours());
    return InscriFromDB;
    }
    @Override
    public List<Inscription> getAll()   {
        return (List<Inscription>) iInscriptionRepository.findAll();     }
    @Override
    public Inscription getById(Long id) {
        return iInscriptionRepository.findById(id).orElse(null);}
    @Override
    public void remove(Long id){
        iInscriptionRepository.deleteById(id);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCours(Inscription inscription, Long numSkieur, Long numCours) {
        Skieur s = skieurRepository.findById(numSkieur).orElse(null);
        Cours c = coursRepository.findById(numCours).orElse(null);
        if (c != null && s != null ){
            if (Period.between(s.getDateNaissance(),LocalDate.now()).getYears() >=18 && c.getTypecours().equals(TypeCours.COLLECTIF_ADULTE)
                    || Period.between(s.getDateNaissance(),LocalDate.now()).getYears()< 18 && c.getTypecours().equals(TypeCours.COLLECTIF_ENFANT)) {
                if (c.getInscriptions().stream().count() < 6 && s.getInscriptions().stream().count()<6)
                {
                    s.getInscriptions().add(inscription);
                    c.getInscriptions().add(inscription);
                }
            }
            s.getInscriptions().add(inscription);
            c.getInscriptions().add(inscription);

        }

        return null;
    }

        }




