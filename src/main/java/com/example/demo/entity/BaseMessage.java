package com.example.demo.entity;

import com.example.demo.entity.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
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

    private BigDecimal price;

    @Builder.Default
    private Date dateTime = new Date();

    private Date suggestedDateTime;

    private String details;

    @Builder.Default
    private BaseMessageStatus status = BaseMessageStatus.WAITING;
}
