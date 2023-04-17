package controlller;

import Services.ISkieurService;
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
    @PutMapping("/update/{id}")
    Skieur update(@RequestBody Skieur s,@PathVariable Long id){
        return iSkieurService.update(s,id);
    }

    @GetMapping("/all")
    public List<Skieur> getAll(){
        return iSkieurService.getAll();
    }
    @GetMapping("/get/{id}")
    public Skieur getById(@PathVariable Long id){
        return iSkieurService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable Long id){
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
