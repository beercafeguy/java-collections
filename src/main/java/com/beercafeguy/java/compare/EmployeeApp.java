package com.beercafeguy.java.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> eList=new ArrayList<>();
        eList.add(new Employee(101,"Hem",2009.0));
        eList.add(new Employee(102,"Abhay",2011.9));
        eList.add(new Employee(103,"Santry",2000.6));
        Collections.sort(eList);
        for (Employee e:eList
             ) {
            System.out.println(e);
        }
    }
}
