package ru.progwards.t13.t13_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//HashSet для отбора уникальных слов
public class NaDvoreTrava {
    final static String TEXT =
            "на дворе трава на траве дрова не руби дрова на траве двора";

    public static void main(String[] args) {
        String[] words = TEXT.split(" ");
        List<String> wordList = Arrays.asList(words);

        Set<String> wordSet = new HashSet<>(wordList);
        System.out.println(wordList);
        System.out.println(wordSet);
    }
}
