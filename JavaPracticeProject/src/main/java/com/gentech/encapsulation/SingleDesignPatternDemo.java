package com.gentech.encapsulation;
class Test
{
    static Test obj=null;
    private Test()
    {
        // private constructor
    }
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

    public static Test getInstance()
    {
        if(obj==null)
        {
            obj=new Test();
        }
        return obj;
    }
}
public class SingleDesignPatternDemo {
    public static void main(String[] args) {
        Test t1=Test.getInstance();
        t1.substraction(20,10);
        t1.multiplication(12,20);
        Test t2=Test.getInstance();
        t2.substraction(70,30);
        t2.multiplication(120,14);
        Test t3=Test.getInstance();
        t3.substraction(90,40);
        t3.multiplication(13,10);

        if(t1==t2 && t2==t3)
        {
            System.out.println("Achieved Singleton design Pattern");
        }
        else
        {
            System.out.println("Not Achieved Singleton design Pattern");
        }
    }
}
