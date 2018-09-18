package com.beercafeguy.java.list;

import java.util.ArrayList;
import java.util.List;

/**
 *  This is ordered on index which means It maintains insertion order
 *  Good for Iteration and Random access
 *  Not so Good for insertion and deletion
 */
public class ArrayListApp {
    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(13);
        l.add(23);
        l.add(55);

        for (int i:l
             ) {
            System.out.print(i+",");
        }
    }
}
