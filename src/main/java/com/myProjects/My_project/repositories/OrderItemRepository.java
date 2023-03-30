package com.myProjects.My_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProjects.My_project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{}
