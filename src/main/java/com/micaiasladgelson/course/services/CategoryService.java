package com.micaiasladgelson.course.services;

import com.micaiasladgelson.course.entities.Category;
import com.micaiasladgelson.course.entities.User;
import com.micaiasladgelson.course.repositories.CategoryRepository;
import com.micaiasladgelson.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
