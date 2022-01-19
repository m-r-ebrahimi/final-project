package com.example.demo.dto.option;

import com.example.demo.entity.option.HomeServiceOption;
import com.example.demo.entity.users.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomersOrderUpdateParam {
    private Long id;
    @NotNull
    private HomeServiceOption service;
    @NotNull
    private Customer customer;
}
