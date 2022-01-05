package com.example.demo.entity;

import com.example.demo.entity.HomeService;
import com.example.demo.entity.core.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class HomeServiceOption extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private HomeService homeService;
    private BigDecimal basePrice;
    private String description;
}
