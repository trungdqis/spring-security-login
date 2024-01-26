package com.trungdq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseLoader {

    private UserRepository userRepository;

    public DatabaseLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public CommandLineRunner initializeDatabase() {
        return args -> {
            User user1 = new User("vana@gmail.com", "vana123", Role.ADMIN);
            User user2 = new User("vanb@gmail.com", "vanb123", Role.ADMIN);
            User user3 = new User("vanc@gmail.com", "vanc123", Role.USER);
            User user4 = new User("vand@gmail.com", "vand123", Role.USER);

            userRepository.saveAll(List.of(user1, user2, user3, user4));

            System.out.println("Sample database initialized");
        };
    }
}
