package controlller;

import Services.IAbonnementService;
import entities.TypeAbonnement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import entities.Abonnement;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/abonnement")
public class Abonnementcontroller {

    @Autowired
    private final IAbonnementService iabonnementService;
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
    @GetMapping("/type")
    public List<Abonnement> getByType(@RequestBody TypeAbonnement typeAbonnement)
    {
        return iabonnementService.getSubscriptionByType(typeAbonnement);
    }


    //DateTimeFormat to fix a certain pattern
    @GetMapping("/{startDate}/{endDate}")
    public List<Abonnement> getAbonBetweenDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate)
    {
        return iabonnementService.retrieveSubscriptionsByDates(startDate,endDate);
    }

}



