package com.example.demo.entity.order;

import com.example.demo.entity.core.BaseEntity;
import com.example.demo.entity.user.Customer;
import com.example.demo.entity.user.Expert;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Comment extends BaseEntity {

    private Integer points;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Customer sender;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Expert recipient;

    @OneToOne
    private ServiceOrder order;
}
