package com.example;

public class AssertionMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Assertion Demo!");

        int result = 2 + 3;
        System.out.println("2 + 3 = " + result);

        boolean isGreater = 5 > 3;
        System.out.println("Is 5 > 3? " + isGreater);

        boolean isLesser = 5 < 3;
        System.out.println("Is 5 < 3? " + isLesser);

        Object obj1 = null;
        System.out.println("obj1 is null? " + (obj1 == null));

        Object obj2 = new Object();
        System.out.println("obj2 is not null? " + (obj2 != null));
    }
}
