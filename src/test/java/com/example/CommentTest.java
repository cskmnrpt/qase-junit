package com.example;

import io.qase.junit4.Qase;
import org.junit.Test;

public class CommentTest {

    @Test
    public void testWithComment_success() {
        Qase.comment("This shall appears under the 'actual result' field of the result");
        System.out.println("Test with comment success");
    }
}
