package com.micaiasladgelson.course.repositories;

import com.micaiasladgelson.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
