package com.ensah.mon_projet.repository;
import com.ensah.mon_projet.entity.Annotateur;
import com.ensah.mon_projet.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Optional<Utilisateur> findByLogin(String login); //Ce retour peut exister, ou non
    @Query("SELECT a FROM Annotateur a WHERE a.utilisateur.actif = true")
    List<Annotateur> findAnnotateursActifs();
}
