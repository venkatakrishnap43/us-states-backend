package com.usastates.usastates.States;

public class StateDataFactory {
    private StateDataFactory(){}

    public final static State validState(){
        return State.builder()
                .stateName("Texas")
                .stateCode("TX")
                .stateCapital("Austin")
                .stateGovernor("Test")
                .build();
    }

    public final static StateEntity validStateEntity(){
        return StateEntity.builder()
                .stateName("Texas")
                .stateCode("TX")
                .stateCapital("Austin")
                .stateGovernor("Test")
                .build();
    }
}
