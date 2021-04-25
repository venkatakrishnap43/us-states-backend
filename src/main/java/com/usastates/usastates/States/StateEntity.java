package com.usastates.usastates.States;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "states")
@IdClass(StateKey.class)
public class StateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String stateName;
    @Id
    private String stateCode;
    private String stateCapital;
    private String stateGovernor;
}
