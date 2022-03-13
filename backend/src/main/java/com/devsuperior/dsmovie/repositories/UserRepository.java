package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // TODO: ver se consigo fazer esta consulta na base de dados sem a declaração deste método
    User findByEmail(String email);
}
