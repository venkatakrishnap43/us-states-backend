package com.usastates.usastates.States;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

import static com.usastates.usastates.States.StateDataFactory.validState;
import static java.util.Collections.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.jwt;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class StateControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    StateService stateService;

    @Test
    void getState() throws Exception {

        //Given
        State state = validState();

        //When
        when(stateService.getStates()).thenReturn(singletonList(state));
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/v1/state/service/get/states").header(HttpHeaders.AUTHORIZATION, "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0MUBnbWFpbC5jb20iLCJleHAiOjE2MjAxODAzOTB9.7x9ndiWRkbFpPiQ8Is1SWcYyoKsLgIsWbN5YuDxuE1GoQ2lg43jx5BRBWiu_J_yKCq6ORnXuJ-CDDdBLH2F_-Q"))
                .andExpect(status().isOk())
                .andReturn();

        String result = mvcResult.getResponse().getContentAsString();

        String expected = "[\n" +
                "    {\n" +
                "        \"stateName\": \"Texas\",\n" +
                "        \"stateCode\": \"TX\",\n" +
                "        \"stateCapital\": \"Austin\",\n" +
                "        \"stateGovernor\": \"Test\"\n" +
                "    }\n" +
                "]";

        //then
        JSONAssert.assertEquals(expected, result, JSONCompareMode.STRICT);
    }
}