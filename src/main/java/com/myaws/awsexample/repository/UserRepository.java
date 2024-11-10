package com.myaws.awsexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myaws.awsexample.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
