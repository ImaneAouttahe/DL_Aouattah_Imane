package com.ensah.mon_projet.repository;
import com.ensah.mon_projet.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByNomRole(Role.NomRole nomRole);
}

