package com.example.demo.dto.option;

import com.example.demo.entity.option.HomeService;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeServiceOptionCreateParam {
    @NonNull
    @Size(max = 15)
    private String name;
    @NonNull
    @Size
    private Long homeServiceId;
    @NonNull
    private BigDecimal basePrice;
    @NonNull
    @Size
    private String description;
}
