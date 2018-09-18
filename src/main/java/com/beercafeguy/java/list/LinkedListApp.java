package com.beercafeguy.java.list;

import java.util.LinkedList;
import java.util.List;

/**
 *  This is a doubly linked list and ordered as ArrayList using index
 *  Iteration is slower then ArrayList
 *  Insertion and deletion is faster then ArrayList
 *  After java 5, LinkedList implements Queue interface as well
 */
public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Delhi");
        ll.add("Bangalore");
        ll.add("Chennai");

        System.out.println("Peek: "+ll.peek());
        System.out.println("Iteration which is slow ");
        for (String city:ll
             ) {
            System.out.println(city);
        }
    }
}

