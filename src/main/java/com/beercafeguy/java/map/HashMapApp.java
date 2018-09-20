package com.beercafeguy.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 *  Unsorted and Unordered Map
 *  It uses equal and hashCode methods for managing elements
 *
 *  It allows one null key and multiple null values
 *
 */
public class HashMapApp {
    public static void main(String[] args) {
        Map<String,String> capitals=new HashMap<>();
        capitals.put("Karnataka","Bangalore");
        capitals.put("UP","Lucknow");
        capitals.put("J&K","Srinagar");
        capitals.put("Uttarakhand","Dehradun");
        capitals.put(null,"NA");

        for (Map.Entry entry: capitals.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" | Value: "+entry.getValue());
        }
    }
}
