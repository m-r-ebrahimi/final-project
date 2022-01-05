package com.example.demo.entity.order;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.core.BaseEntity;
import com.example.demo.entity.order.message.BaseMessageStatus;
import com.example.demo.entity.order.message.Request;
import com.example.demo.entity.order.message.Suggestion;
import com.example.demo.entity.order.message.SuggestionStatus;
import com.example.demo.entity.service.SubService;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ServiceOrder extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    private SubService service;

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
