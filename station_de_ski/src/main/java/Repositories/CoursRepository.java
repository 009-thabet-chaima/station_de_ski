package Repositories;

import entities.Cours;
import entities.Support;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long> {
    List<Cours> findBySupport(Support support);

}