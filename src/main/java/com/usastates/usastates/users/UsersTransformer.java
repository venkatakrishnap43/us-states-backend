package com.usastates.usastates.users;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UsersTransformer {
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserEntity toEntity(Users users){
        return UserEntity.builder()
                .email(users.getEmail())
                .phoneNumber(users.getPhoneNumber())
                .password(bCryptPasswordEncoder.encode(users.getPassword()))
                .lastName(users.getLastName())
                .firstName(users.getFirstName())
                .build();
    }

    public Users fromEntity(UserEntity userEntity){
        return Users.builder()
                .email(userEntity.getEmail())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .phoneNumber(userEntity.getPhoneNumber())
                .password(userEntity.getPassword()).build();
    }

    public UserSignUpResponse fromEntityToResponse(UserEntity userEntity){
        return UserSignUpResponse.builder()
                .email(userEntity.getEmail())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .phoneNumber(userEntity.getPhoneNumber())
                .build();
    }
}
