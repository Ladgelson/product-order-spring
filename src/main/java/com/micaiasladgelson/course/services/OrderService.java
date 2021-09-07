package com.micaiasladgelson.course.services;

import com.micaiasladgelson.course.entities.Order;
import com.micaiasladgelson.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = OrderRepository.findById(id);
        return order.get();
    }
}
