package com.example.demo.entity.user;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.core.BasePerson;
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
public class User extends BasePerson {

    @ManyToMany
    private List<UserRole> roles;

    @Builder.Default
    private Date date = new Date();

    private BigDecimal balance;

    @Builder.Default
    private UserStatus status = UserStatus.NEW;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Builder.Default
    private List<Transaction> transactions = new ArrayList<>();

}
