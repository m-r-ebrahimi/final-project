package com.example.demo.dto.option;

import com.example.demo.entity.option.HomeServiceOption;
import com.example.demo.entity.option.OrderStatus;
import com.example.demo.entity.option.Suggestion;
import com.example.demo.entity.users.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomersOrderCreateParam {
    @NotNull
    private HomeServiceOption service;
    @NotNull
    private Customer customer;
}
