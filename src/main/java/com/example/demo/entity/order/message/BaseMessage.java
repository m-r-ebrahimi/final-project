package com.example.demo.entity.order.message;

import com.example.demo.entity.core.BaseEntity;
import com.example.demo.entity.order.ServiceOrder;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.Date;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseMessage extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private ServiceOrder order;


    @Column(nullable = false)
    private BigDecimal price;

    @Builder.Default
    private Date dateTime = new Date(System.currentTimeMillis());

    @Column(nullable = false)
    private Date suggestedDateTime;

    private String details;


    @Column(nullable = false)
    @Builder.Default
    private BaseMessageStatus status = BaseMessageStatus.WAITING;
}
