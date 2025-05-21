package com.gentech.oopsdemo;
class Demo
{
    int number=10;
    void showNumbers()
    {
        System.out.println(number);
        number=number+1;
        if(number<=20)
        {
            showNumbers();
        }
    }

    int findFactorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n * findFactorial(n -1);
    }
}
public class RecursionProgramDemo {
    public static void main(String[] args) {
        Demo o=new Demo();
        o.showNumbers();
        System.out.println(o.findFactorial(5));
    }
}
