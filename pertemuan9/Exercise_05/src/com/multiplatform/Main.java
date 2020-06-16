package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays (long minutes){
        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        long modDay = day % 365;
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        System.out.println(minutes + " min = " + year + " y " + "and " + modDay + " d");
    }
}