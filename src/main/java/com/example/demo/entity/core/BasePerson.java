package com.example.demo.entity.core;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BasePerson extends BaseEntity {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @Lob
    @Builder.Default
    private byte[] photo=new byte[300_000];
}
