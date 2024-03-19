package com.example.demo.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.demo.controller.DemoController;

@WebMvcTest(DemoController.class)
public class DemoControllerTest {


    @Autowired
    private MockMvc mockMvc; // Injected by WebMvcTest

    @Test
    public void testHelloWithName() throws Exception {
        String name = "John";

        mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
                .andExpect(status().isOk()) // Assert OK status code
                .andExpect(MockMvcResultMatchers.content().string("Hello " + name + " welcome to application"));
    }

  
	
}
