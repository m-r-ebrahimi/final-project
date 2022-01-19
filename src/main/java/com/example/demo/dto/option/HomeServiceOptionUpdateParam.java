package com.example.demo.dto.option;

import lombok.*;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeServiceOptionUpdateParam {
    private Long id;
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
