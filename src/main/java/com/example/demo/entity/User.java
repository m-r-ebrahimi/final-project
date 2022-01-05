package com.example.demo.entity;

import com.example.demo.entity.core.BaseUser;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseUser {
    @ManyToMany
    private List<UserRole> roles;

    @ManyToMany
    private List<Status> statuses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Builder.Default
    private List<OrderHistory>  = new ArrayList<>();
}
