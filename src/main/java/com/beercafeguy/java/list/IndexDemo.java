package com.beercafeguy.java.list;

import java.util.ArrayList;
import java.util.List;

public class IndexDemo {
    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        // this wil throw array out of bound as we don't have 12 elements in array
        //l.add(12,13);
        l.add(0,13);
        l.add(1,23);
        l.add(2,55);
        System.out.println("Size of the array is : "+l.size());
        // this wil throw array out of bound as we don't have 12 elements in array
        for (int i=0;i<l.size();i++){
            System.out.println("Index: "+i+" | Element: "+l.get(i));
        }
    }
}
