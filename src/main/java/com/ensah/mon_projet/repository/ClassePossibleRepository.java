package com.ensah.mon_projet.repository;
import com.ensah.mon_projet.entity.ClassePossible;
import com.ensah.mon_projet.entity.Dataset;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClassePossibleRepository extends JpaRepository<ClassePossible, Integer> {
    List<ClassePossible> findByDataset(Dataset dataset);
}