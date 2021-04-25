package com.usastates.usastates.States;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "v1/state/service")
@AllArgsConstructor
public class StateController {

    StateService stateService;

    @GetMapping(path = "/get/states" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<State> getState(){
        return stateService.getStates();
    }
}
