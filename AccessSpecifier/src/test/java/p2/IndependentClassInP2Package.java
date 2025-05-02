package p2;

import p1.Protection;

public class IndependentClassInP2Package {
    Protection p1=new Protection();
    public IndependentClassInP2Package()
    {
     // System.out.println("private_a :"+p1.private_a);
     // System.out.println("default_b :"+p1.default_b);
     // System.out.println("protected_c :"+p1.protected_c);
        System.out.println("public_d :"+p1.public_d);
        System.out.println("++++++++++++++");
    }
}
