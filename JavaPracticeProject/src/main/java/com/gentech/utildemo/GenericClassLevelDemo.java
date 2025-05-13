package com.gentech.utildemo;
class Sample<T>
{
    T obj;
    void add(T obj)
    {
        this.obj=obj;
    }

    T get()
    {
        return obj;
    }
}
public class GenericClassLevelDemo {
    public static void main(String[] args) {
        //With Generic Approach
        Sample<Integer> o1=new Sample<Integer>();
        o1.add(100);
        int v1=o1.get();
        System.out.println(v1);
        Sample<String> o2=new Sample<String>();
        o2.add("Welcome");
        String v2=o2.get();
        System.out.println(v2);
        //Without Generic Approach
        Sample o3=new Sample();
        o3.add(200);
        int v3=(int) o3.get();
        o3.add("Hello");
        String v4=(String) o3.get();
        System.out.println(v4);
    }
}
