package com.example;

/**
 * Simple entry point for the sample Maven application.
 */
public final class App {

    private App() {
        // Utility class pattern for main-only applications
    }

    /**
     * Returns the greeting message printed by this application.
     *
     * @return the application greeting
     */
    public static String getMessage() {
        return "Hello Maven Project!";
    }

    /**
     * Application entry point.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println(getMessage());
    }
}
