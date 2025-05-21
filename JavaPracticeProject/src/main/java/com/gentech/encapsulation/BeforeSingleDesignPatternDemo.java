package com.gentech.encapsulation;
class Maths
{
    void substraction(int x,int y)
    {
        int result=(x - y);
        System.out.println("Substraction Result:"+result);
    }

    void multiplication(int x,int y)
    {
        int result=(x * y);
        System.out.println("Multiplication Result:"+result);
    }
}
public class BeforeSingleDesignPatternDemo {
    public static void main(String[] args) {
        Maths o1=new Maths();
        o1.substraction(20,10);
        o1.multiplication(12,20);
        Maths o2=new Maths();
        o2.substraction(70,30);
        o2.multiplication(120,14);
        Maths o3=new Maths();
        o3.substraction(90,40);
        o3.multiplication(13,10);
    }
}
