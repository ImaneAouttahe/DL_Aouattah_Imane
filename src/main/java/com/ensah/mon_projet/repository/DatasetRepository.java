package com.ensah.mon_projet.repository;
import com.ensah.mon_projet.entity.Dataset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatasetRepository extends JpaRepository<Dataset, Integer> {
}