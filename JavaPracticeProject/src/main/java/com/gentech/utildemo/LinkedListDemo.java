package com.gentech.utildemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElements2();
    //    readElementsByIterator();
    //    readElementsByListIterator();
    //    queueDemo();
        withOutGenerics();
    }

    private static void addElements()
    {
        LinkedList<String> obj=new LinkedList<String>();
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
        LinkedList<String> obj1=new LinkedList<String>();
        obj1.add("Blue");
        obj1.add("White");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements:"+obj);
    }

    private static void removeElements()
    {
        LinkedList<String> obj=new LinkedList<String>();
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
        LinkedList<String> obj=new LinkedList<String>();
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
        LinkedList<String> obj=new LinkedList<String>();
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
        LinkedList<String> obj=new LinkedList<String>();
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
        Iterator<String> elements=obj.iterator();
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }
    }

    private static void readElementsByListIterator()
    {
        LinkedList<String> obj=new LinkedList<String>();
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
        System.out.println("Read Elements in Forward Direction");
        ListIterator<String> elements=obj.listIterator();
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }

        System.out.println("Read Elements in Backward Direction");

        while(elements.hasPrevious())
        {
            System.out.println(elements.previous());
        }
    }

    private static void queueDemo()
    {
        Queue<Integer> obj=new LinkedList<Integer>();
        System.out.println("Elements:"+obj);
        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);
        obj.add(500);
        System.out.println("Elements:"+obj);
        obj.remove();
        System.out.println("Elements:"+obj);
    }

    private static void withOutGenerics()
    {
        LinkedList obj=new LinkedList();
        System.out.println("Elements:"+obj);
        obj.add('Y');
        obj.add("Lotus");
        obj.add(true);
        obj.add(10.125);
        System.out.println("Elements:"+obj);
    }
}
