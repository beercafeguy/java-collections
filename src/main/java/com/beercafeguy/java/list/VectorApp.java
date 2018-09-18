package com.beercafeguy.java.list;

import java.util.Vector;

/**
 *  Comes from old days of java
 *  Its same as ArrayList with all the methods synchronized for thread safety
 *
 */
public class VectorApp {

    public static void main(String[] args) {

        Vector<String> v=new Vector<>();
        v.add("Hem");
        v.add("Aman");
        v.add("Mohita");

        for (String name:v
             ) {
            System.out.println(name);
        }

    }
}
