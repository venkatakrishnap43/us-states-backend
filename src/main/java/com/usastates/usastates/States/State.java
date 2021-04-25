package com.usastates.usastates.States;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class State {
    private String stateName;
    private String stateCode;
    private String stateCapital;
    private String stateGovernor;
}
