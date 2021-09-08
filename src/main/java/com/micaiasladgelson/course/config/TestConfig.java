package com.micaiasladgelson.course.config;

import com.micaiasladgelson.course.entities.Category;
import com.micaiasladgelson.course.entities.Order;
import com.micaiasladgelson.course.entities.Product;
import com.micaiasladgelson.course.entities.User;
import com.micaiasladgelson.course.entities.enums.OrderStatus;
import com.micaiasladgelson.course.repositories.CategoryRepository;
import com.micaiasladgelson.course.repositories.OrderRepository;
import com.micaiasladgelson.course.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category c1 = new Category(null, "Eletronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        categoryRepository.saveAll(List.of(c1, c2, c3));
        productRepository.saveAll(List.of(p1, p2, p3, p4, p5));

        p1.getCategories().add(c2);
        p2.getCategories().add(c1);
        p2.getCategories().add(c3);
        p3.getCategories().add(c3);
        p4.getCategories().add(c3);
        p5.getCategories().add(c2);

        productRepository.saveAll(List.of(p1, p2, p3, p4, p5));

        User u1 = new User(null, "Maria Brown", "maria@mail.com", "123455666", "12333");
        User u2 = new User(null, "Mano Brown", "manooo@mail.com", "96789955", "33247");

        Order o1 = new Order(null, Instant.parse("2021-08-17T16:45:08Z"), OrderStatus.WAITING_PAYMANT, u1);
        Order o2 = new Order(null, Instant.parse("2021-08-20T16:45:08Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2021-08-10T16:45:08Z"), OrderStatus.DELIVERED, u1);


        userRepository.saveAll(List.of(u1, u2));
        orderRepository.saveAll(List.of(o1, o2, o3));
    }
}
