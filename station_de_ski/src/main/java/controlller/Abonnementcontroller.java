package controlller;

import Services.IAbonnementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import entities.Abonnement;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/abonnement")
public class Abonnementcontroller {

    @Autowired
    private IAbonnementService iabonnementService;
    @PostMapping("/add")
    public void add(@RequestBody Abonnement a){
        iabonnementService.add(a);
    }
    @PutMapping("/update")
    Abonnement update(@RequestBody Abonnement A){
    return iabonnementService.update(A);
    }

    @GetMapping("/all")
    public List<Abonnement> getAll(){
        return iabonnementService.getAll();
    }
    @GetMapping("/get/{id}")
    public Abonnement getById(@PathVariable("{id}") long id){
        return iabonnementService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("{id}") long id){
        iabonnementService.remove(id);
    }


}
