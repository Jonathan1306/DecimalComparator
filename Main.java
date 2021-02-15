package com.company;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(3.1756,3.175);

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        int number1 = (int)num1;
        int number2 = (int)num2;

        if(number1 != number2){
            return false;
        }

        double decimal1 = num1 * 1000;
        double decimal2 = num2 * 1000;

        double newNum1 = decimal1 % 1000;
        double newNum2 = decimal2 % 1000;

        int finalDecimal1 = (int)newNum1;
        int finalDecimal2 = (int)newNum2;

        if(finalDecimal1 == finalDecimal2){
            return true;
        }

        return false;
    };
}
