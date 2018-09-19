package com.beercafeguy.java.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *  This is one of two sorted collections (Other one is tree map)
 */
public class TreeSetApp {
    public static void main(String[] args) {

        Set<String> cities=new TreeSet<>();
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
