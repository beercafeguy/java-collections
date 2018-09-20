package com.beercafeguy.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  Faster iteration slower insertion maintains order
 */
public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String,Integer> m=new LinkedHashMap<>();
        m.put("Aman",200);
        m.put("Ajay",400);
        m.put("Host",4);

        for (Map.Entry entry:m.entrySet()
             ) {
            System.out.println("Key: "+entry.getKey()+" | Value: "+entry.getValue());
        }
    }
}
