package com.example.demo.entity.user;

import com.example.demo.entity.service.SubService;
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
public class Expert extends User {
    @ManyToMany(cascade = CascadeType.ALL)
    @Builder.Default
    private List<SubService> expertises = new ArrayList<>();
}
