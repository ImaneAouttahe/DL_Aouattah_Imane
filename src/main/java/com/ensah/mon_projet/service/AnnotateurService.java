package com.ensah.mon_projet.service;
import com.ensah.mon_projet.entity.Annotateur;
import java.util.List;

public interface AnnotateurService {
    Annotateur getAnnotateurById(Integer id);
    void updateAnnotateur(Integer id, String nom, String prenom , String login);
    List<Annotateur> getAnnotateursByDataset(Integer datasetId);
}
