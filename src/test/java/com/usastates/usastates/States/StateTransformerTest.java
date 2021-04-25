package com.usastates.usastates.States;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.usastates.usastates.States.StateDataFactory.validState;
import static com.usastates.usastates.States.StateDataFactory.validStateEntity;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StateTransformerTest {

    @InjectMocks
    StateTransformer stateTransformer;

    @Test
    void fromEntity() {

        //Given
        State expected = validState();
        StateEntity stateEntity = validStateEntity();

        //when
        State result = stateTransformer.fromEntity(stateEntity);

        //then
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void toEntity() {

        //Given
        State state = validState();
        StateEntity expected = validStateEntity();

        //when
        StateEntity result = stateTransformer.toEntity(state);

        //then
        assertThat(expected).isEqualTo(result);
    }
}