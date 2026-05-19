package com.levelingproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levelingproject.course.entities.OrderItem;
import com.levelingproject.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
