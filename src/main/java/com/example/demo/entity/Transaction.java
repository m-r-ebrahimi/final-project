package com.example.demo.entity;

import com.example.demo.entity.core.BaseEntity;
import com.example.demo.entity.order.ServiceOrder;
import com.example.demo.entity.user.Customer;
import com.example.demo.entity.user.Expert;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Transaction extends BaseEntity {
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private ServiceOrder order;

    private BigDecimal amount;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Customer payer;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Expert recipient;
    private Date dateTime;
}
