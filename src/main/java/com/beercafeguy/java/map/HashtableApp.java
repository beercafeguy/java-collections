package com.beercafeguy.java.map;

import java.util.Hashtable;
import java.util.Set;

/**
 *  This is same as vector from prior collection Error
 *  Hashtable is the synchronized counterpart to HashMap
 *  a Hashtable doesn’t let you have anything that’s null.
 */
public class HashtableApp {
    public static void main(String[] args) {
        Hashtable table=new Hashtable();
        table.put("Hem",20000);
        table.put("Ajay",200);
        table.put("Pooja",200000);
        //below will throw null pointer exception as Hashtable wont allow null key or value
        //table.put("NA",null);

        Set<String> keys=table.keySet();
        for (String key: keys
             ) {
            System.out.println("Key: "+key+" | Value: "+table.get(key));
        }


    }
}
