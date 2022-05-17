package ru.gb.core2.lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {
    private final Map<String, Set<String>> entries = new TreeMap<>();
    private Set<String> getPhones(String name) {
        return entries.computeIfAbsent(name, key -> new HashSet<>());
    }
    public Set<String> get(String name) {
        return getPhones(name);
    }



    public void add(String name, String phoneNumber) {
        Set<String> phones = getPhones(name);
        phones.add(phoneNumber);
    }
}
