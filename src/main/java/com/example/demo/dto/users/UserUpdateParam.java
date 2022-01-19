package com.example.demo.dto.users;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateParam {
    private Long userId;
    @NonNull
    @Size(max = 15)
    private String firstname;
    @NonNull
    @Size(max = 15)
    private String lastname;
    @Email
    private String email;
    @NonNull
    @Size(max = 15)
    private String username;
    @NonNull
    @Size(max = 15)
    private String password;
    private byte[] photo;
}
