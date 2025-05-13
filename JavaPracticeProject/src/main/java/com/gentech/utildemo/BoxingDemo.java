package com.gentech.utildemo;

public class BoxingDemo {
    public static void main(String[] args) {
        autoBoxingDemo();
    }

    private static void autoBoxingDemo()
    {
        int a=45;
        System.out.println("int a :"+a);
        //Convert to Wraper Object
        Integer b=Integer.valueOf(a);
        System.out.println("Integer b:"+b);
        //AutoBoxing
        Integer c=a;
        System.out.println("Integer c :"+c);
    }
}
