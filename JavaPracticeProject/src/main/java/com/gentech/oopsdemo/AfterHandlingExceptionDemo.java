package com.gentech.oopsdemo;
class BasicMaths1
{
    static void addition(int x,int y)
    {
        int result=(x+y);
        System.out.println("Addition Result :"+result);
    }

    static void multiplication(int x,int y)
    {
        int res=(x*y);
        System.out.println("Multiplication Result :"+res);
    }

    static void substraction(int x,int y)
    {
        int res=(x-y);
        System.out.println("Substraction Result :"+res);
    }

    static void division(int x,int y)
    {
        try
        {
            int res=(x/y);
            System.out.println("Division Result :"+res);
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }

    static void modulus(int x,int y)
    {
        int res=(x%y);
        System.out.println("Modulus Result :"+res);
    }

    static void averageValue(int x,int y)
    {
        int res=((x+y)/2);
        System.out.println("Average Result :"+res);
    }

    static void isEvenNumber(int x)
    {
        if(x%2==0)
        {
            System.out.println(x+" is a Even Number");
        }
    }

    static void isOddNumber(int x)
    {
        if(x%2==1)
        {
            System.out.println(x+" is a Odd Number");
        }
    }

    static void isPositiveNumber(int x)
    {
        if(x>0)
        {
            System.out.println(x+" is a Postive Number");
        }
    }

    static void isNegativeNumber(int x)
    {
        if(x<0)
        {
            System.out.println(x+" is a Negative Number");
        }
    }
}
public class AfterHandlingExceptionDemo {
    public static void main(String[] args) {
        BasicMaths1.addition(20, 50);
        BasicMaths1.isPositiveNumber(45);
        BasicMaths1.isNegativeNumber(-255);
        BasicMaths1.substraction(100, 75);
        BasicMaths1.division(450, 0);
        BasicMaths1.multiplication(12, 15);
        BasicMaths1.isEvenNumber(78);
        BasicMaths1.isOddNumber(333);
        BasicMaths1.averageValue(40, 50);
        BasicMaths1.modulus(37, 2);
    }
}
