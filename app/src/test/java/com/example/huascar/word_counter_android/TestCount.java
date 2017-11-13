package com.example.huascar.word_counter_android;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

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
        assertNotNull(count.numberOfOcurrences("Hola amigo como estas amigo amigo"));
    }

    @Test
    public void TestSortHash() {
        Count count = new Count();
        HashMap<String, Integer> occurences = count.numberOfOcurrences("hola amigo amigo como como como estas");
        assertNotNull(count.orderByValue(occurences));
    }
}
