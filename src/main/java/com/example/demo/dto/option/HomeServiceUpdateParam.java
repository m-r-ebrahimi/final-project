package com.example.demo.dto.option;

import lombok.*;

import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeServiceUpdateParam {
    private Long id;
    @NonNull
    @Size(max = 15)
    private String name;
}
