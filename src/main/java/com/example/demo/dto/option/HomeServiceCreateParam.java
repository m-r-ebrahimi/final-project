package com.example.demo.dto.option;

import lombok.*;

import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeServiceCreateParam {
    @NonNull
    @Size(max = 15)
    private String name;
}
