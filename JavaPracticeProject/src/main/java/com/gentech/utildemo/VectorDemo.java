package com.gentech.utildemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElements2();
    //    readElementsByIterator();
    //    readElementsByEnumeration();
        withoutGenerics();
    }

    private static void addElements()
    {
        Vector<String> obj=new Vector<String>();
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
        Vector<String> obj1=new Vector<String>();
        obj1.add("Blue");
        obj1.add("White");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements:"+obj);
    }

    private static void removeElements()
    {
        Vector<String> obj=new Vector<String>();
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
        Vector<String> obj=new Vector<String>();
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
        Vector<String> obj=new Vector<String>();
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
        Vector<String> obj=new Vector<String>();
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

    private static void readElementsByEnumeration()
    {
        Vector<String> obj=new Vector<String>();
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
        Enumeration<String> elements =obj.elements();
        while(elements.hasMoreElements())
        {
            System.out.println(elements.nextElement());
        }
    }

    private static void withoutGenerics()
    {
        Vector obj=new Vector();
        System.out.println("Elements:"+obj);
        obj.add('Y');
        obj.add("Lotus");
        obj.add(true);
        obj.add(10.125);
        System.out.println("Elements:"+obj);
    }
}
