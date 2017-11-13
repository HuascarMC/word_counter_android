package com.example.huascar.word_counter_android;

import java.util.HashMap;

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
            int counter = 1;
            for (String wordAgain : splitSentence) {
                if (wordAgain == word) {
                    counter ++;
                }
            }
           occurences.put(word, counter);
           }
           return occurences;
        }
    }


