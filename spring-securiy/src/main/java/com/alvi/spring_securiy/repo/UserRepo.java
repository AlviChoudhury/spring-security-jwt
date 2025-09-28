package com.alvi.spring_securiy.repo;

import com.alvi.spring_securiy.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
    Users findByEmail(String email);
}
