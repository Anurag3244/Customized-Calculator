package com.company;

import java.util.Scanner;

class invalidInputException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid Input. Cannot add 8 & 9.";
    }
}
class cannotDivideByZero extends Exception{
    @Override
    public String getMessage() {
        return "Mathematical Error, Cannot divide by Zero.";
    }
}
class maxInputException extends Exception{
    @Override
    public String getMessage() {
        return "Sorry, input cannot be greater than 1,00,000 ";
    }
}
class maxMultiplierReachedException extends Exception{
    @Override
    public String getMessage() {
        return "Input value for multiplication cannot be greater than 7000.";
    }
}

class customCalculator{

    double  addition(double  a, double  b) throws invalidInputException, maxInputException {
        if (a> 100000 || b > 100000){
            throw new maxInputException();
        }
//        if (a == 8 || a== 9) {
//            throw new invalidInputException();
//        }
        return a + b;
    }

    double  subtraction(double  a, double  b) throws maxInputException {
        if (a> 100000 || b > 100000){
            throw new maxInputException();
        }
         return a - b;
    }

    double  multiplication(double a, double b) throws maxInputException, maxMultiplierReachedException{
        if (a > 10000 || b> 10000){
            throw new maxMultiplierReachedException();
        }
//        if (a> 100000 || b > 100000){
//            throw new maxInputException();
//        }
        return a * b;
    }

    double  division(double  a, double  b)throws invalidInputException,cannotDivideByZero, maxInputException, maxMultiplierReachedException{
        if (a> 100000 || b > 100000){
            throw new maxInputException();
        }
        if(b == 0) {
            throw new cannotDivideByZero();
        }
        return a / b;
    }
}



public class Exercise_Project5 {

    public static void main(String[] args) throws invalidInputException, maxInputException, maxMultiplierReachedException, cannotDivideByZero {

        Scanner sc = new Scanner(System.in);
        customCalculator c  = new customCalculator();
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to the Custom Calculator");
        System.out.println("Rule: ");
        System.out.println("     1. Input cannot be greater than 1,00,000.");
        System.out.println("     2. Input value for multiplication cannot be greater than 7000.");
        System.out.println("Enter the type of operation you want to perform: ");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.print("Enter your choice for operation: ");
        double y = x.nextInt();

        if (y > 4 || y < 1) {
            System.out.println("Invalid Choice Input");
        }
            {
                if (y == 1) {
                    System.out.print("Please enter your first numbers for addition: ");
                    double m = x.nextInt();
                    System.out.print("Please enter your second numbers for addition: ");
                    double n = x.nextInt();
                    System.out.print("Your result is: ");
                    System.out.println(c.addition(m, n));
                }

                if (y == 2) {
                    System.out.print("Please enter your first numbers: ");
                    double o = x.nextInt();
                    System.out.print("Please enter your second numbers: ");
                    double p = x.nextInt();
                    System.out.print("Your result is: ");
                    System.out.println(c.subtraction(o, p));
                }
                if (y == 3) {
                    System.out.print("Please enter your first numbers: ");
                    double q = x.nextInt();
                    System.out.print("Please enter your second numbers: ");
                    double r = x.nextInt();
                    System.out.print("Your result is: ");
                    System.out.println(c.multiplication(q, r));
                }
                if (y == 4) {
                    System.out.print("Please enter your first numbers: ");
                    double s = x.nextInt();
                    System.out.print("Please enter your second numbers: ");
                    double t = x.nextInt();
                    System.out.print("Your result is: ");
                    System.out.println(c.division(s, t));
                }
            }



    }
}
