package com.example.demo.dto.option;

import com.example.demo.entity.option.CustomersOrder;
import com.example.demo.entity.users.Employee;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
/*@Builder
@AllArgsConstructor
@NoArgsConstructor*/
public class SuggestionCreateParam {

}
