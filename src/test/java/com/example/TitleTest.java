package com.example;

import io.qase.commons.annotation.QaseTitle;
import org.junit.Test;

public class TitleTest {

    @Test
    @QaseTitle("Test with `@QaseTitle` annotation")
    public void test() {
        System.out.println("passed");
    }
}
