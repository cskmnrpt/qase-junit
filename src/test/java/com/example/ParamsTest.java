package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamsTest {

    private final String data;

    public ParamsTest(String data) {
        this.data = data;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arguments() {
        return Arrays.asList(new Object[][] {
                { "Example1" },
                { "Example2" },
                { "Example3" }
        });
    }

    @Test
    public void testMethod_success1() {
        System.out.println("Data is: " + data);
    }
}
