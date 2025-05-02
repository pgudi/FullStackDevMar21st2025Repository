package p1;

public class IndependentClassInP1Package {
    Protection p1=new Protection();
    public IndependentClassInP1Package()
    {
   //   System.out.println("private_a :"+p1.private_a);
        System.out.println("default_b :"+p1.default_b);
        System.out.println("protected_c :"+p1.protected_c);
        System.out.println("public_d :"+p1.public_d);
        System.out.println("++++++++++++++");
    }
}
