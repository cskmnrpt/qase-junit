package com.example;

import io.qase.commons.annotation.*;
import org.junit.Test;

public class SuiteTest {
    @Test
    @QaseSuite("Parent Suite")
    public void testWithSuite_success() {
        System.out.println("passed");
    }

    @Test
    @QaseSuite("Parent Suite\tChild Suite")
    public void testWithSuite_failed() {
        System.out.println("passed");
    }
}
