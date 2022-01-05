package com.example.demo.entity.user;

import com.example.demo.entity.order.ServiceOrder;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Customer extends User {

    @OneToMany(cascade = CascadeType.ALL)
    @Builder.Default
    private List<ServiceOrder> orders = new ArrayList<>();

}
