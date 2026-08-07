package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void getMessageReturnsExpectedGreeting() {
        assertEquals("Hello Maven Project!", App.getMessage());
    }

    @Test
    void getMessageIsNotNull() {
        assertNotNull(App.getMessage());
    }

    @Test
    void getMessageIsNotBlank() {
        assertFalse(App.getMessage().isBlank());
    }

    @Test
    void getMessageContainsMavenKeyword() {
        assertTrue(App.getMessage().contains("Maven"));
    }

    @Test
    void mainPrintsGreetingToStandardOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(capturedOutput));
            assertDoesNotThrow(() -> App.main(new String[]{}));
            assertEquals("Hello Maven Project!" + System.lineSeparator(), capturedOutput.toString());
        } finally {
            System.setOut(originalOut);
        }
    }
}
