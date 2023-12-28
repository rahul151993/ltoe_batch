package com.ltoe.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DemoControllerTest {

    @InjectMocks
    private DemoController demoController;

    @Test
    void greetingTest() {
        Assertions.assertThat(this.demoController.greeting("Test").getBody()).isEqualTo("Hello there! This is my first gradle action workflow. i am Test");
    }
}
