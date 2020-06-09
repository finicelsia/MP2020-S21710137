package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 2;
        short myShortValue = 4;
        int myIntValue = 6;
        long myLongValue = (5_000L + 10L) * (myByteValue + myShortValue + myIntValue);

        System.out.println("myLongValue = " + myLongValue);
    }
}
