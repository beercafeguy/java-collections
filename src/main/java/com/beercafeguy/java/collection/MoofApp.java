package com.beercafeguy.java.collection;

/**
 * If two objects are equal, there hashCode should also be equal.
 * But two objects with same hashCode may not be equal.
 *
 * SO always use same attributes in hashCode and equals.
 *
 * DO not use transient variables in equals and hashCode methods
 * as these variables are not reproducible after serialization
 *
 * Transient variables come back with default value after serialization
 * rather then original value.
 *
 */
public class MoofApp {
    public static void main(String[] args) {
        Moof moof1=new Moof(102);
        Moof moof2=new Moof(102);
        System.out.println("Equals check without implementing equals: "+moof1.equals(moof2));
        System.out.println("Hash Code check before implementing hashCode: "+moof1.hashCode()+"|"+moof2.hashCode());

        MoofCorrected m1=new MoofCorrected(102);
        MoofCorrected m2=new MoofCorrected(102);

        System.out.println("Equals check after implementing equals: "+m1.equals(m2));
        System.out.println("Hash Code check before implementing hashCode: "+m1.hashCode()+"|"+m2.hashCode());
    }
}
