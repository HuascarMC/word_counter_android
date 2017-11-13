package com.example.huascar.word_counter_android;

import org.junit.Test;

import java.util.HashMap;

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

    @Test
    public void TestOccurrences() {
        HashMap<String, Integer> occurences = new HashMap<>();
        Count count = new Count();
        assertEquals(null, count.numberOfOcurrences("it ot it"));
    }
}
