package executiondemo;

import p1.IndependentClassInP1Package;
import p1.Protection;
import p1.SubClassInP1Package;
import p2.IndependentClassInP2Package;
import p2.SubClassInP2Package;

public class ExecutionDemo {
    public static void main(String[] args) {
        //Execute Protection class Constructor
   //     Protection o1=new Protection();
        //Execute SubClassInP1Package class Constructor
   //     SubClassInP1Package o2=new SubClassInP1Package();
        //Execute IndependentClassInP1Package class constructor
   //     IndependentClassInP1Package o3=new IndependentClassInP1Package();
        //Execute SubClassInP2Package class constructor
   //     SubClassInP2Package o4=new SubClassInP2Package();
        IndependentClassInP2Package o5=new IndependentClassInP2Package();
    }
}
