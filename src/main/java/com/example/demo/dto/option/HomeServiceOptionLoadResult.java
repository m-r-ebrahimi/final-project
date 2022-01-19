package com.example.demo.dto.option;

import com.example.demo.entity.option.HomeService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeServiceOptionLoadResult {
    private String name;
    private HomeService homeService;
    private BigDecimal basePrice;
    private String description;
}
