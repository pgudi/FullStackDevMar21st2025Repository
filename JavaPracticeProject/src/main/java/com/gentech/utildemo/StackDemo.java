package com.gentech.utildemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack st=new Stack();
        pushDemo(st, 10);
        pushDemo(st, 20);
        pushDemo(st, 30);
        pushDemo(st, 40);
        pushDemo(st, 50);
        popDemo(st);
    }

    private static void pushDemo(Stack st, int a)
    {
        st.push(a);
        System.out.println("Element Added :"+a);
    }

    private static void popDemo(Stack st)
    {
        int b=(int) st.pop();
        System.out.println("Removed Element :"+b);
    }
}
