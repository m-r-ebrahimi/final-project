package com.example.demo.bootstrap;

import com.example.demo.entity.users.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@Profile({"dev", "prod"})
public class Bootstrap implements CommandLineRunner {

    private final CustomerService customerService;
    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) {
        log.info("try to register customers ...");
        if (customerRepository.count() == 0) {
            Customer user = Customer.builder()
                    .firstname("Ali")
                    .username("Ali1234")
                    .password("lskjdklfj")
                    .build();
            customerService.save(user);
            log.info("register default user and account");
        }
    }
}
