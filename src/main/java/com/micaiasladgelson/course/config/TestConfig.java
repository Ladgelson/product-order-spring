package com.micaiasladgelson.course.config;

import com.micaiasladgelson.course.entities.Order;
import com.micaiasladgelson.course.entities.User;
import com.micaiasladgelson.course.repositories.OrderRepository;
import com.micaiasladgelson.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@mail.com", "123455666", "12333");
        User u2 = new User(null, "Mano Brown", "manooo@mail.com", "96789955", "33247");

        Order o1 = new Order(null, Instant.parse("2021-08-17T16:45:08Z"), u1);
        Order o2 = new Order(null, Instant.parse("2021-08-20T16:45:08Z"), u2);
        Order o3 = new Order(null, Instant.parse("2021-08-10T16:45:08Z"), u1);

        userRepository.saveAll(List.of(u1, u2));
        orderRepository.saveAll(List.of(o1, o2, o3));
    }
}
