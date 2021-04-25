package com.usastates.usastates.States;

import org.springframework.stereotype.Component;

@Component
public class StateTransformer {
    public State fromEntity(StateEntity stateEntity){
        return State.builder()
                .stateCode(stateEntity.getStateCode())
                .stateCapital(stateEntity.getStateCapital())
                .stateGovernor(stateEntity.getStateGovernor())
                .stateName(stateEntity.getStateName())
                .build();
    }

    public StateEntity toEntity(State state){
        return StateEntity.builder()
                .stateCode(state.getStateCode())
                .stateCapital(state.getStateCapital())
                .stateGovernor(state.getStateGovernor())
                .stateName(state.getStateName())
                .build();
    }
}
