package com.example.demo.entity;

import com.example.demo.entity.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ServiceOrder extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    private HomeServiceOption serviceOption;

    private Date finishDateTime;

    @OneToOne(cascade = CascadeType.ALL)
    private Request request;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Suggestion> suggestions;

    @OneToOne(cascade = CascadeType.ALL)
    private Suggestion suggestion;

    @Builder.Default
    private OrderStatus status = OrderStatus.WAITING_FOR_SUGGESTION;

    @OneToOne
    private Transaction transaction;

    @OneToOne
    private Comment comment;


}
