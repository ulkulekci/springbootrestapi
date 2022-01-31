package com.innova.springbootrestapi.repository;

import com.innova.springbootrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
