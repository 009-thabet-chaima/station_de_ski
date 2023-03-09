package controlller;

import Repositories.SkieurRepository;
import Services.IAbonnementService;
import Services.ISkieurService;
import Services.SkieurServiceImp;
import entities.Abonnement;
import entities.Skieur;
import entities.TypeAbonnement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/Skieur")
public class Skieurcontroller {


    @Autowired
    private ISkieurService iSkieurService;
    @PostMapping("/add")
    public void add(@RequestBody Skieur S){
        iSkieurService.add(S);
    }
    @PutMapping("/update")
    Skieur update(@RequestBody Skieur s){
        return iSkieurService.update(s);
    }

    @GetMapping("/all")
    public List<Skieur> getAll(){
        return iSkieurService.getAll();
    }
    @GetMapping("/get/{id}")
    public Skieur getById(@PathVariable("{id}") long id){
        return iSkieurService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("{id}") long id){
        iSkieurService.remove(id);
    }
    @PutMapping("/{numSkieur}/{numPiste}")
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste){
        return iSkieurService.assignSkierToPiste( numSkieur,   numPiste);

    }

    @GetMapping("/get/subscription/{type}")

    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
        return iSkieurService.retrieveSkiersBySubscriptionType(typeAbonnement);

    }

}
