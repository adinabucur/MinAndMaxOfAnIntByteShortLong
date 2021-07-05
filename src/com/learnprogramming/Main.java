package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("myMinIntValue = " + myMinIntValue);
        System.out.println("myMaxIntValue = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("test = " + myMaxIntValue);
        
    }

}
