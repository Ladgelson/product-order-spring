package com.micaiasladgelson.course.repositories;

import com.micaiasladgelson.course.entities.Category;
import com.micaiasladgelson.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
