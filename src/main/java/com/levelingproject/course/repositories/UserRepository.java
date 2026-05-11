package com.levelingproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levelingproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
