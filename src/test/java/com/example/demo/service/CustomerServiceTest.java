package com.example.demo.service;

import com.example.demo.config.AppConfig;
import com.example.demo.entity.users.Customer;
import com.example.demo.entity.option.CustomersOrder;
import com.example.demo.entity.option.HomeService;
import com.example.demo.entity.option.HomeServiceOption;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.CustomersOrderRepository;
import com.example.demo.repository.HomeServiceOptionRepository;
import com.example.demo.repository.HomeServiceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ActiveProfiles("test")
@SpringJUnitConfig({AppConfig.class})
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomersOrderRepository customersOrderRepository;

    @Autowired
    private HomeServiceRepository homeServiceRepository;

    @Autowired
    private HomeServiceOptionRepository homeServiceOptionRepository;


    @Test
    void testSaveCustomer_isOk() {
        Customer user = Customer.builder()
                .firstname("Ali")
                .username("Ali1234")
                .password("lskjdklfj")
                .build();
        customerService.save(user);
        Optional<Customer> result = customerRepository.findById(user.getId());
        assertEquals(user, result.orElse(new Customer()));
    }

    @Test
    void testAddOrder_isOk() {
        Customer user = Customer.builder()
                .firstname("Ali")
                .username("Ali1234")
                .password("lskjdklfj")
                .build();
        customerService.save(user);

        HomeService homeService = HomeService.builder()
                .name("cleaning")
                .build();

        HomeServiceOption homeServiceOption = HomeServiceOption.builder()
                .homeService(homeService)
                .basePrice(BigDecimal.valueOf(12_000))
                .description("washing ...")
                .build();

        homeService.getSubServices().add(homeServiceOption);
        homeServiceRepository.save(homeService);
        homeServiceOptionRepository.save(homeServiceOption);
        CustomersOrder order = CustomersOrder.builder()
                .customer(user)
                .service(homeServiceOption)
                .build();
        customersOrderRepository.save(order);
        customerService.addOrder(user, order);

        Optional<Customer> customer = customerRepository.findById(user.getId());
        assertEquals(customer.orElse(new Customer()).getOrders(), user.getOrders());
    }
}
