package controlller;

import Services.IMoniteurService;
import entities.Moniteur;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/Moniteur")
public class Moniteurcontroller {

    @Autowired
    private IMoniteurService iMoniteurService;
    @PostMapping("/add")
    public void add(@RequestBody Moniteur M){
        iMoniteurService.add(M);
    }
    @PutMapping("/update/{id}")
    Moniteur update(@RequestBody Moniteur M,@PathVariable Long id){
        return iMoniteurService.update(M,id);
    }

    @GetMapping("/all")
    public List<Moniteur> getAll(){
        return iMoniteurService.getALL();
    }
    @GetMapping("/get/{id}")
    public Moniteur getById(@PathVariable Long id){
        return iMoniteurService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable Long id){
        iMoniteurService.remove(id);
    }
}
