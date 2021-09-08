package com.micaiasladgelson.course.repositories;

import com.micaiasladgelson.course.entities.Category;
import com.micaiasladgelson.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
