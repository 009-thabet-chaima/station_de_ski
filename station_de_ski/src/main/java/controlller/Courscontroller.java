package controlller;

import Services.IAbonnementService;
import Services.ICoursService;
import entities.Abonnement;
import entities.Cours;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Cours")

public class Courscontroller {
    @Autowired
    private ICoursService iCoursService;
    @PostMapping("/add")
    public void add(@RequestBody Cours c){
        iCoursService.add(c);
    }
    @PutMapping("/update")
    Cours update(@RequestBody Cours C){
        return iCoursService.update(C);
    }

    @GetMapping("/all")
    public List<Cours> getAll(){
        return iCoursService.getAll();
    }
    @GetMapping("/get/{id}")
    public Cours getById(@PathVariable long id){
        return iCoursService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable long id){
        iCoursService.remove(id);
    }

}
