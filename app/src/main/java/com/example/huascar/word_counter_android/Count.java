package com.example.huascar.word_counter_android;

/**
 * Created by huascar on 13/11/2017.
 */

public class Count {

    public int count(String sentence) {
        String[] splitSentence = sentence.split(" ");
        int counted = splitSentence.length;
        return counted;
    }

}
