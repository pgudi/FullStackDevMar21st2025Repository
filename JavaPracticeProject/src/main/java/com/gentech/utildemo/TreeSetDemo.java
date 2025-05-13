package com.gentech.utildemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
    //    addElements();
    //      removeElements();
    //    readElements();
        readElementsByIterator();
    }

    private static void addElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Grapes");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        TreeSet<String> obj1=new TreeSet<String>();
        obj1.add("Blue");
        obj1.add("White");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements:"+obj);
    }

    private static void removeElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Grapes");
        obj.add("Banana");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        obj.remove("Jack Fruit");
        System.out.println("Elements:"+obj);
        obj.removeAll(obj);
        System.out.println("Elements:"+obj);
    }

    private static void readElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Grapes");
        obj.add("Banana");
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

    private static void readElementsByIterator()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Grapes");
        obj.add("Banana");
        obj.add("Orange");
        obj.add("Jack Fruit");
        obj.add("Watermelon");
        obj.add("Kiwi");
        System.out.println("Elements:"+obj);
        Iterator<String> elements=obj.iterator();
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }
    }
}
