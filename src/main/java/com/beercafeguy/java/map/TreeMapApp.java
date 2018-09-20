package com.beercafeguy.java.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *  This is another sorted collection
 */
public class TreeMapApp {
    public static void main(String[] args) {
        Map<String,Integer> m=new TreeMap<>();
        m.put("Aman",200);
        m.put("Ajay",400);
        m.put("Host",4);
        //null key not allowed
       // m.put(null,4);

        for (Map.Entry entry:m.entrySet()
                ) {
            System.out.println("Key: "+entry.getKey()+" | Value: "+entry.getValue());
        }
    }
}
