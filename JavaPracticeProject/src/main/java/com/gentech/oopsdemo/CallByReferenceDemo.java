package com.gentech.oopsdemo;
class Calculate2
{
    int x,y;

    void showData2(Calculate2 obj)
    {
        obj.x+=100;
        obj.y*=12;
        System.out.println("In Method, Value of x :"+obj.x);
        System.out.println("In Method, Value of y :"+obj.y);
    }
}
public class CallByReferenceDemo {
    public static void main(String[] args) {
        Calculate2 obj=new Calculate2();
        obj.x=10;
        obj.y=5;
        System.out.println("Before Execution of Method,value of x :"+obj.x);
        System.out.println("Before Execution of Method,value of y :"+obj.y);

        obj.showData2(obj);

        System.out.println("After Execution of Method,value of x :"+obj.x);
        System.out.println("After Execution of Method,value of y :"+obj.y);
    }
}
