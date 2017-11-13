package com.example.huascar.word_counter_android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huascar on 13/11/2017.
 */

public class Count {

    public int count(String sentence) {
        String[] splitSentence = sentence.split(" ");
        int counted = splitSentence.length;
        return counted;
    }

    public HashMap numberOfOcurrences(String sentence) {
        String[] splitSentence = sentence.split(" ");
        HashMap<String, Integer> occurences = new HashMap<>();

        for (String word : splitSentence) {
            if (occurences.containsKey(word)) {
                int newValue = occurences.get(word) + 1;
                occurences.put(word, newValue);
            } else {
                occurences.put(word, 1);
            }
        }
        return occurences;
    }

    public HashMap orderByValue(HashMap hash) {
        List<Integer> intList = new ArrayList<Integer>(hash.values());

        Collections.sort(intList, new Comparator<Integer>() {

            public int compare(Integer o1, Integer o2) {
                // for descending order
                return o1 - o2;
            }
        });
        return hash;
    }
}



