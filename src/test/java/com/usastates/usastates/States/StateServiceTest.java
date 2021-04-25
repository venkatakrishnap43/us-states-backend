package com.usastates.usastates.States;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.usastates.usastates.States.StateDataFactory.validState;
import static com.usastates.usastates.States.StateDataFactory.validStateEntity;
import static java.util.Collections.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StateServiceTest {

    @Mock
    StateTransformer stateTransformer;

    @Mock
    StateRepository stateRepository;

    @InjectMocks
    StateService stateService;

    @Test
    void getStates() {

        //Given
        State state = validState();
        StateEntity stateEntity = validStateEntity();
        List<State> expected = singletonList(state);

        //when
        when(stateRepository.findAll()).thenReturn(singletonList(stateEntity));
        when(stateTransformer.fromEntity(stateEntity)).thenReturn(state);
        List<State> result = stateService.getStates();

        //then
        assertThat(expected).isEqualTo(result);

    }
}