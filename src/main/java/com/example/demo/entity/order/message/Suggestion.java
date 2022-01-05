package com.example.demo.entity.order.message;

import com.example.demo.entity.user.Expert;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Suggestion extends BaseMessage {

    @ManyToOne
    private Expert owner;

    private Double duration;

    @Builder.Default
    private SuggestionStatus suggestionStatus = SuggestionStatus.PENDING;
}
