package com.myProjects.My_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.My_project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
