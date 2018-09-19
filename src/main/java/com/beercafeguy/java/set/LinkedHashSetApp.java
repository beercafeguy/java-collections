package com.beercafeguy.java.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *  This is an ordered version of HashSet and it implements Doubly Linked List
 *  maintains insertion order
 *
 */
public class LinkedHashSetApp {
    public static void main(String[] args) {

        Set<String> cities=new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Delhi");

        for (String city: cities
                ) {
            System.out.println(city);
        }
    }
}
