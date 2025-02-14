package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testWithoutAnyQaseAnnotations() {
        // Arrange
        App app = new App();

        // Act
        int result = app.add(2, 3);

        // Assert
        assertEquals("2 + 3 should equal 5", 5, result);
    }
}
