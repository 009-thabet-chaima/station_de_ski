package controlller;

import Services.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import entities.Abonnement;

import java.util.List;

@RestController
@RequestMapping("/abonnement")
public class Abonnementcontroller {

    @Autowired
    private IAbonnementService iabonnementService;
    @PostMapping

    public void add(@RequestBody Abonnement a){
        iabonnementService.add(a);
    }
@PutMapping
Abonnement update(@RequestBody Abonnement A){
    return iabonnementService.update(A);
    }

    @GetMapping
    public List<Abonnement> getAll(){
        return iabonnementService.getAll();
    }
    @GetMapping("/{id}")
    public Abonnement getById(@PathVariable long id){
        return iabonnementService.getById(id);

    }
    @GetMapping("/{id}")
    public void remove(@PathVariable long id){
        iabonnementService.remove(id);
    }


}
