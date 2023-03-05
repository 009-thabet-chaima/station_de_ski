package Services;

import Repositories.CoursRepository;
import entities.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursServiceImp implements ICoursService{
    @Autowired
    private CoursRepository coursRepository;
    @Override
    //traitement qcq
    public void add(Cours C){
        coursRepository.save(C);
    }
    @Override
    public Cours update(Cours C){return coursRepository.save(C);}
    @Override
    public List<Cours> getAll()   { return (List<Cours>) coursRepository.findAll();     }

    @Override
    public Cours getById(Long id) {
        return null;
    }

    @Override
    public Cours getById(long id) { return coursRepository.findById(id).orElse(other:null);}
    @Override
    public void remove(long id){
        coursRepository.deleteById(id);
    }

}
