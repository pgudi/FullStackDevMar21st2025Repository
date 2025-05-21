package com.gentech.interfacedemo;
/*
In multiple inheritance both interfaces contains same default
 methods with Signature
 */

interface Purchase
{
    default void showItemName(String name)
    {
        System.out.println("The Item name which has purchased :"+name);
    }
}

interface Order
{
    default void showItemName(String name)
    {
        System.out.println("The Item name which has Ordered :"+name);
    }
}

class Buyer implements Purchase, Order
{
    public void showItemName(String name)
    {
        System.out.println("The Item name  :"+name);
    }
}
public class SameDefaultMethodsInMultipleInheritance {
    public static void main(String[] args) {
        Buyer o=new Buyer();
        o.showItemName("Lenovo Laptop");
    }
}
