package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Suggestion extends BaseMessage {

    @ManyToOne
    private Employee employee;

    @Builder.Default
    private SuggestionStatus suggestionStatus = SuggestionStatus.PENDING;
}
