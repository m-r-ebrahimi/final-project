package com.example.demo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Employee extends User {
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @Builder.Default
    private List<HomeServiceOption> expertises = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @Builder.Default
    private List<Suggestion> suggestions=new ArrayList<>();
}
