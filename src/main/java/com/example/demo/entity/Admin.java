package com.example.demo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends User implements Serializable {
    private transient Long adminRegister;
}
