package com.example.demo.entity;

import com.example.demo.entity.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CustomersOrder extends BaseEntity {
    @ManyToOne(cascade = CascadeType.ALL)
    private HomeServiceOption service;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Suggestion> suggestions;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "select_suggestion_id")
    private Suggestion selectSuggestion;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
