package com.gentech.utildemo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElements2();
    //    readElementsByIterator();
        withOutGenerics();
    }

    private static void addElements()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements:"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add(0,"Grapes");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        ArrayList<String> obj1=new ArrayList<String>();
        obj1.add("Blue");
        obj1.add("White");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements:"+obj);
    }

    private static void removeElements()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements:"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add(0,"Grapes");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        obj.remove("Jack Fruit");
        System.out.println("Elements:"+obj);
        obj.remove(1);
        System.out.println("Elements:"+obj);
        obj.removeAll(obj);
        System.out.println("Elements:"+obj);
    }

    private static void readElements1()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements:"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add(0,"Grapes");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        for(String str:obj)
        {
            System.out.println(str);
        }
    }

    private static void readElements2()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements:"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add(0,"Grapes");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }

    private static void readElementsByIterator()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements:"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add(0,"Grapes");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        //read Elements
        Iterator<String> elements=obj.iterator();
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }
    }

    private static void withOutGenerics()
    {
        List obj=new ArrayList();
        System.out.println("Elements:"+obj);
        obj.add('Y');
        obj.add("Lotus");
        obj.add(true);
        obj.add(10.125);
        System.out.println("Elements:"+obj);
    }

}
