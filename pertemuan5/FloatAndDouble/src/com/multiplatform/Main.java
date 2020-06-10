package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value = " + myMinFloatValue);
        System.out.println("Maxmum Float Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Value = " + myMinDoubleValue);
        System.out.println("Maxmum Double Value = " + myMaxDoubleValue);

        int myIntegerNumber = 5/3;
        float myFloatNumber = 5f / 3f;
        //float myFloatNumber2 = (float) 5/ (float) 3;
        double myDoubleNumber = 5d/3d;

        System.out.println(myIntegerNumber);
        System.out.println(myFloatNumber);
        //System.out.println(myFloatNumber2);
        System.out.println(myDoubleNumber);
    }
}
