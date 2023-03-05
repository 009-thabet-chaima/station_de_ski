package controlller;

import Services.IInscriptionService;
import Services.IPisteService;
import entities.Inscription;
import entities.Piste;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/Piste")
public class Pistecontroller {
    @Autowired
    private IPisteService iPisteService;
    @PostMapping("/add")
    public void add(@RequestBody Piste i){
        iPisteService.add(i);
    }
    @PutMapping("/update")
    Piste update(@RequestBody Piste I){
        return iPisteService.update(I);
    }

    @GetMapping("/all")
    public List<Piste> getAll(){
        return iPisteService.getAll();
    }
    @GetMapping("/get/{id}")
    public Piste getById(@PathVariable("{id}") long id){
        return iPisteService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("{id}") long id){
        iPisteService.remove(id);
    }

}
