package com.gentech.oopsdemo;
class Calculate1
{
    void showData1(int x,int y)
    {
        x+=100;
        y*=12;
        System.out.println("In Method, Value of x :"+x);
        System.out.println("In Method, Value of y :"+y);
    }
}
public class CallByValueDemo {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        System.out.println("Before Execution of Method,value of x :"+x);
        System.out.println("Before Execution of Method,value of y :"+y);

        Calculate1 obj=new Calculate1();
        obj.showData1(x,y);

        System.out.println("After Execution of Method,value of x :"+x);
        System.out.println("After Execution of Method,value of y :"+y);
    }
}
