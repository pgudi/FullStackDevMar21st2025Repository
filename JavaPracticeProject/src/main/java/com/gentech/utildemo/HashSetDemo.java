package com.gentech.utildemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
     //   addElements();
     //   removeElements();
     //   readElements();
     //   readElementsByIterator();
        withOutGenerics();
    }

    private static void addElements()
    {
        HashSet<String> obj=new HashSet<String>();
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
        HashSet<String> obj1=new HashSet<String>();
        obj1.add("Blue");
        obj1.add("White");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements:"+obj);
    }

    private static void removeElements()
    {
        HashSet<String> obj=new HashSet<String>();
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
        HashSet<String> obj=new HashSet<String>();
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
        HashSet<String> obj=new HashSet<String>();
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

    private static void withOutGenerics()
    {
        HashSet obj=new HashSet();
        System.out.println("Elements:"+obj);
        obj.add('Y');
        obj.add("Lotus");
        obj.add(true);
        obj.add(10.125);
        System.out.println("Elements:"+obj);
    }
}
