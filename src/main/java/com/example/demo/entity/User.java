package com.example.demo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class User extends BaseUser {
    @Builder.Default
    private Date date = new Date();
    private BigDecimal balance;

    @ManyToMany
    private List<UserRole> roles;
    @ManyToMany
    private List<UserStatus> statuses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Builder.Default
    private List<Transaction> transactions = new ArrayList<>();

}
