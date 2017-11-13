package com.example.huascar.word_counter_android;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 13/11/2017.
 */

public class TestCount {

    @Test
    public void TestCount() {
        Count count = new Count();
        assertEquals(3, count.count("Kentucky fried chicken"));
    }
}
