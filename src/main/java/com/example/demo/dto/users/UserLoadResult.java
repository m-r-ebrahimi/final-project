package com.example.demo.dto.users;

import com.example.demo.entity.users.UserRole;
import com.example.demo.entity.users.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoadResult {
    private String firstname;
    private String lastname;
    private String email;
    private List<UserRole> roles;
    private List<UserStatus> statuses;
}
