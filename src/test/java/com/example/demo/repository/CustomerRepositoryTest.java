package com.example.demo.repository;


import com.example.demo.entity.Customer;
import com.example.demo.entity.UserStatus;
import com.example.demo.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ActiveProfiles("test")
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository userRepository;
    @Test
    void testFindById_isOk() {
        Customer user = Customer.builder()
                .firstname("Ali")
                .username("Ali1234")
                .password("lskjdklfj")
                .build();
        userRepository.save(user);

        Optional<Customer> result = userRepository.findById(user.getId());
        assertEquals(user, result.orElse(new Customer()));
    }


}