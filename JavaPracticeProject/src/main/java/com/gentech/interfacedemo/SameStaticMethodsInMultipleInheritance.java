package com.gentech.interfacedemo;

/*
In multiple inheritance both interfaces contains same
static  methods with Signature
 */
interface Purchase1
{
    static void showItemName(String name)
    {
        System.out.println("The Item name which has purchased :"+name);
    }
}

interface Order1
{
    static void showItemName(String name)
    {
        System.out.println("The Item name which has Ordered :"+name);
    }
}

class Buyer1 implements Purchase1, Order1
{

}
public class SameStaticMethodsInMultipleInheritance {
    public static void main(String[] args) {
        Purchase1.showItemName("Dell Desktop");
        Order1.showItemName("HP Laptop");
    }
}
