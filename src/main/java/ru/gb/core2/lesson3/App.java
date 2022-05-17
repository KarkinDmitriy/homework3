package ru.gb.core2.lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;


public class App {
    private static final String words =
            "My name is Dmitriy" + "My name is Nikolay" + "His name is Pavel" + "Summer is coming" + "Victory is coming";

    private static  TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.merge(s, 1, Integer::sum);
        }
        return map;
    }




    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Sidorov", "89111234567");
        phonebook.add("Nikolaev", "89111234568");
        phonebook.add("Butko", "89111234569");
        phonebook.add("Nikolaev", "89111234561");
        phonebook.add("Butko", "89111234562");
        phonebook.add("Sidorov", "89111234563");
        phonebook.add("Nikolaev", "89111234564");
        phonebook.add("Sidorov", "89111234565");
        phonebook.add("Sidorov", "89111234566");

        System.out.println("Sidorov: " + phonebook.get("Sidorov"));
        System.out.println("Butko: " + phonebook.get("Butko"));
        System.out.println("Nikolaev: " + phonebook.get("Nikolaev"));

        System.out.println(getWords(words.toUpperCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));
    }
}