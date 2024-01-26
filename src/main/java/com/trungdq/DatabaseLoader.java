package com.trungdq;

import com.trungdq.admin.User;
import com.trungdq.admin.UserRepository;
import com.trungdq.customer.Customer;
import com.trungdq.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseLoader {

    private UserRepository userRepository;
    private CustomerRepository customerRepository;

    public DatabaseLoader(UserRepository userRepository, CustomerRepository customerRepository) {
        this.userRepository = userRepository;
        this.customerRepository = customerRepository;
    }

    @Bean
    public CommandLineRunner initializeDatabase() {
        return args -> {
            User user1 = new User("vana@gmail.com", "vana123");
            User user2 = new User("vanb@gmail.com", "vanb123");

            userRepository.saveAll(List.of(user1, user2));

            Customer customer1 = new Customer("customera@gmail.com", "a123", "Customer A");
            Customer customer2 = new Customer("customerb@gmail.com", "b123", "Customer B");

            customerRepository.saveAll(List.of(customer1, customer2));

            System.out.println("Sample database initialized");
        };
    }
}
