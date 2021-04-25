package com.usastates.usastates.users;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
@Slf4j
public class UserService implements UserDetailsService {

    UsersRepository usersRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;
    UsersTransformer usersTransformer;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity userEntity = usersRepository.findByEmail(email);
        if(userEntity == null) throw new RuntimeException("User not found");

        return new User(userEntity.getEmail(), userEntity.getPassword(), new ArrayList<>());
    }

    public UserEntity findByEmail(String email){
        return usersRepository.findByEmail(email);
    }

    public UserSignUpResponse addNewUser(Users users){
        if(usersRepository.findByEmail(users.getEmail()) != null){
            throw new RuntimeException("User Already exists");
        }

        return usersTransformer.fromEntityToResponse(usersRepository.save(usersTransformer.toEntity(users)));
    }
}
