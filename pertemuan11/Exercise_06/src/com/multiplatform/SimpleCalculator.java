package com.multiplatform;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){ //1
        return firstNumber;
    }
    public double getSecondNumber(){ //2
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){ //3
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){ //4
        this.secondNumber= secondNumber;
    }
    public double  getAdditionResult(){ //5
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){ //6
        return  firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){ //7
        return firstNumber * secondNumber;
    }
    public double  getDivisionResult(){ //8
        if (secondNumber == 0){
            return 0;
        }
        else return firstNumber / secondNumber;
    }
}