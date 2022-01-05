package com.example.demo.entity.order.message;

import com.example.demo.entity.user.Customer;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Request extends BaseMessage {
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer owner;

    @Column(nullable = false)
    private String address;
}
