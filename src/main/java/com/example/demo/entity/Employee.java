package com.example.demo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Employee extends User {
    @ManyToMany(cascade = CascadeType.ALL)
    @Builder.Default
    private List<HomeServiceOption> expertises = new ArrayList<>();
}
