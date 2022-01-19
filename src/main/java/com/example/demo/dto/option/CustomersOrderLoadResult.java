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
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomersOrderLoadResult {
    private HomeServiceOption service;
    private Customer customer;
    private List<Suggestion> suggestions=new ArrayList<>();
    private Suggestion selectSuggestion;
    private OrderStatus status;
}
