package com.usastates.usastates.States;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StateService {

    StateRepository stateRepository;
    StateTransformer stateTransformer;

    public List<State> getStates(){
        return stateRepository.findAll().stream().map(e-> stateTransformer.fromEntity(e)).collect(Collectors.toList());
    }
}
