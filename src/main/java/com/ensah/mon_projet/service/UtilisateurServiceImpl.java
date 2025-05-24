package com.ensah.mon_projet.service;
import com.ensah.mon_projet.entity.Utilisateur;
import com.ensah.mon_projet.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Override
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }
}
