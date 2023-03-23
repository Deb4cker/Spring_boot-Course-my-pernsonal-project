package com.myProjects.My_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.My_project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
