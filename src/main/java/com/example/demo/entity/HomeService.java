package com.example.demo.entity;

import com.example.demo.entity.core.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HomeService extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "homeService", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Builder.Default
    private List<HomeServiceOption> homeServiceOptions = new ArrayList<>();
}
