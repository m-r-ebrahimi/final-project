package com.example.demo.entity.core;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseUser extends BaseEntity {
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    @Temporal(TemporalType.DATE)
    @Builder.Default
    private final LocalDate date = LocalDate.now();
    @Temporal(TemporalType.TIME)
    @Builder.Default
    private final LocalTime time = LocalTime.now();
    private BigDecimal balance;
    @Lob
    private byte[] picture;


}
