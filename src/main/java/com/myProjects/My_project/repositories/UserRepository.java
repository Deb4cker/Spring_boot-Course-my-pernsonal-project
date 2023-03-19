package com.myProjects.My_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myProjects.My_project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{}
