package controlller;

import Services.IAbonnementService;
import Services.IInscriptionService;
import entities.Abonnement;
import entities.Inscription;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/Inscription")

public class Inscriptioncontroller {

    @Autowired
    private IInscriptionService iInscriptionService;
    @PostMapping("/add")
    public void add(@RequestBody Inscription i){
        iInscriptionService.add(i);
    }
    @PutMapping("/update")
    Inscription update(@RequestBody Inscription I){
        return iInscriptionService.update(I);
    }

    @GetMapping("/all")
    public List<Inscription> getAll(){
        return iInscriptionService.getAll();
    }
    @GetMapping("/get/{id}")
    public Inscription getById(@PathVariable("{id}") long id){
        return iInscriptionService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("{id}") long id){
        iInscriptionService.remove(id);
    }

}
