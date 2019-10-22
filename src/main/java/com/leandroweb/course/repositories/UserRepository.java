package com.leandroweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
