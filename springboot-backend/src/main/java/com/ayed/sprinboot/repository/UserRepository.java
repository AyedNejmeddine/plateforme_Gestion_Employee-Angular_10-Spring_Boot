package com.ayed.sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayed.sprinboot.modele.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
