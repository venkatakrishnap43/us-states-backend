package com.usastates.usastates.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
