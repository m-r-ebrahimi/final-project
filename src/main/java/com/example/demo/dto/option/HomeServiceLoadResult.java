package com.example.demo.dto.option;

import com.example.demo.entity.option.HomeServiceOption;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeServiceLoadResult {
    private String name;
    private List<HomeServiceOption> subServices;
}
