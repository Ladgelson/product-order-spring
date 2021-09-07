package com.micaiasladgelson.course.repositories;

import com.micaiasladgelson.course.entities.Order;
import com.micaiasladgelson.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
