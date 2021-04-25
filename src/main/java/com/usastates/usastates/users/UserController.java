package com.usastates.usastates.users;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/user/service")
@AllArgsConstructor
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    UserService userService;

    @PostMapping(path = "/sign-up", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserSignUpResponse addNewUser(@RequestBody Users users){
        log.info("New user request for email : {}", users.getEmail());
        return userService.addNewUser(users);
    }
}
