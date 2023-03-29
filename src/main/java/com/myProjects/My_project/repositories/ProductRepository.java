package com.myProjects.My_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.My_project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
