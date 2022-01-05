package com.example.demo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends User{
    @OneToMany(cascade = CascadeType.ALL)
    @Builder.Default
    private List<OrderOfCustomer> orders = new ArrayList<>();
}
