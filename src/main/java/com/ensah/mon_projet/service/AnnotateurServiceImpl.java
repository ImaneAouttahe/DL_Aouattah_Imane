package com.ensah.mon_projet.service;
import com.ensah.mon_projet.entity.Annotateur;
import com.ensah.mon_projet.repository.AnnotateurRepository;
import com.ensah.mon_projet.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnnotateurServiceImpl implements AnnotateurService {
    @Autowired
    private AnnotateurRepository annotateurRepository;

    @Override
    public Annotateur getAnnotateurById(Integer id) {
        return annotateurRepository.findByUtilisateurId(id)
                .orElseThrow(() -> new RuntimeException("Annotateur non trouvé"));
    }
    @Override
    public void updateAnnotateur(Integer id, String nom, String prenom , String login) {
        Annotateur annotateur = annotateurRepository.findByUtilisateurId(id)
                .orElseThrow(() -> new RuntimeException("Annotateur non trouvé"));
        annotateur.getUtilisateur().setNom(nom);
        annotateur.getUtilisateur().setPrenom(prenom);
        annotateur.getUtilisateur().setLogin(login);
        annotateurRepository.save(annotateur);
    }

    public List<Annotateur> getAnnotateursByDataset(Integer datasetId) {
        return annotateurRepository.findByDatasetId(datasetId)
                .stream()
                .filter(a -> a != null && a.getUtilisateur() != null)
                .collect(Collectors.toList());
    }
}
