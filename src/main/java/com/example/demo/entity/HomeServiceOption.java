package com.example.demo.entity;

import com.example.demo.entity.core.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HomeServiceOption extends BaseEntity {
    private String name;
    private BigDecimal amount;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    private HomeService homeService;
}
