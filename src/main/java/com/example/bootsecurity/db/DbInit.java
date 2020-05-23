package com.example.bootsecurity.db;

import com.example.bootsecurity.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private UserRepository userRepository;

    public DbInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void  run(String... args) {
        User user = new User("user", "user123", "USER", "");
        User admin = new User("admin", "admin123", "ADMIN", "ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager", "manager123", "MANAGER", "ACCESS_TEST1");

        List<User> users = Arrays.asList(user, admin, manager);

        this.userRepository.saveAll(users);

    }
}
