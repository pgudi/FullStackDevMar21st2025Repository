package com.gentech.oopsdemo;
class Sample
{
    static int count=0;
    Sample()
    {
        count=count+1;
    }
}
public class ObjectsCountDemo {
    public static void main(String[] args) {
        Sample o1=new Sample();
        Sample o2=new Sample();
        Sample o3=new Sample();
        Sample o4=new Sample();
        System.out.println("# of Objects Count:"+Sample.count);

    }
}
