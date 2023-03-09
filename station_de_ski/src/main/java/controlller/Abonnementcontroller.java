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
    public Abonnement add(@RequestBody Abonnement a){
       return iabonnementService.add(a);
    }
    @PutMapping("/update/{id}")
    Abonnement update(@RequestBody Abonnement A,@PathVariable Long id){
    return iabonnementService.update(A,id);
    }

    @GetMapping(value = "/all")
    public List<Abonnement> getAll(){
        return iabonnementService.getAll();
    }
    @GetMapping("/get/{id}")
    public Abonnement getById(@PathVariable Long id){
        return iabonnementService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable Long id){
        iabonnementService.remove(id);
    }


}
