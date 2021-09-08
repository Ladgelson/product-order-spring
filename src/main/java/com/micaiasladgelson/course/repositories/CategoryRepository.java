package com.micaiasladgelson.course.repositories;

import com.micaiasladgelson.course.entities.Category;
import com.micaiasladgelson.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
