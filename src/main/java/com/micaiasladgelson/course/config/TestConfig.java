package com.micaiasladgelson.course.config;

import com.micaiasladgelson.course.entities.User;
import com.micaiasladgelson.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@mail.com", "123455666", "12333");
        User u2 = new User(null, "Mano Brown", "manooo@mail.com", "96789955", "33247");

        userRepository.saveAll(List.of(u1, u2));
    }
}
