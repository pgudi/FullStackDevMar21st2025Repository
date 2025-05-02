package p2;

import p1.Protection;

public class SubClassInP2Package extends Protection {

    public SubClassInP2Package()
    {
    //  System.out.println("private_a :"+private_a);
    //  System.out.println("default_b :"+default_b);
        System.out.println("protected_c :"+protected_c);
        System.out.println("public_d :"+public_d);
        System.out.println("++++++++++++++");
    }
}
