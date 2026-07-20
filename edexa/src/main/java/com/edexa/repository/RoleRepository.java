package com.edexa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edexa.entity.Role;
import com.edexa.enums.RoleType;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
    Optional<Role> findByName(RoleType name);

    boolean exiexistsByName(RoleType name);
}
