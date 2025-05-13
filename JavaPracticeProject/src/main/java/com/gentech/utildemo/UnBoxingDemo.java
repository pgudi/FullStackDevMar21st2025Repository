package com.gentech.utildemo;

public class UnBoxingDemo {
    public static void main(String[] args) {
        unboxing();
    }

    private static void unboxing()
    {
        Integer a=Integer.valueOf(55);
        System.out.println("Integer a:"+a);
        //Convert Wrapper Object into Primitive
        int b=a.intValue();
        System.out.println("int b:"+b);
        //Unboxing
        int c=a;
        System.out.println("int c:"+c);
    }
}
