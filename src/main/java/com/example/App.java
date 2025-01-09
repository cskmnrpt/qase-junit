package com.example;

public class App {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Main method (optional, for manual testing)
    public static void main(String[] args) {
        App app = new App();
        System.out.println("Sum: " + app.add(2, 3)); // Output: Sum: 5
    }
}
