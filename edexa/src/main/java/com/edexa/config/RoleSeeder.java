package com.edexa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.edexa.entity.Role;
import com.edexa.enums.RoleType;
import com.edexa.repository.RoleRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RoleSeeder implements CommandLineRunner {
    
    private final RoleRepository roles;

    @Override
    public void run(String... args){

        for(RoleType r: RoleType.values()){

            if(!roles.exiexistsByName(r)){

                Role role = Role.builder()
                .name(r)
                .build();

                roles.save(role);
            }
        }
    }

}
