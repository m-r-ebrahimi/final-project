package com.example.demo.entity.user;

import com.example.demo.entity.core.BasePerson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@SuperBuilder
public class Admin extends BasePerson {

}
