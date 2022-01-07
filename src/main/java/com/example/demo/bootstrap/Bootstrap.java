package com.example.demo.bootstrap;

import com.example.demo.entity.users.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.CustomersOrderRepository;
import com.example.demo.repository.HomeServiceOptionRepository;
import com.example.demo.repository.HomeServiceRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Bootstrap implements CommandLineRunner {

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

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {
        Customer user = Customer.builder()
                .firstname("Ali")
                .username("Ali1234")
                .password("lskjdklfj")
                .build();
        customerService.save(user);
    }
}
