package com.gentech.threaddemo;
class MyClass implements  Runnable
{

    @Override
    public void run() {
        System.out.println("Welcome to the Entry Point for threads!!");
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyClass obj=new MyClass();

        Thread t1=new Thread(obj);
        t1.start();

    }
}
