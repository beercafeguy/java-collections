package com.beercafeguy.java.set;

import java.util.HashSet;
import java.util.Set;

/**
 *  unordered and unsorted set
 */
public class HashSetApp {
    public static void main(String[] args) {
        Set<String> cities=new HashSet<>();
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
