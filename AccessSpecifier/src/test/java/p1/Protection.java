package p1;

public class Protection {
    private int private_a=100;
    int default_b=200;
    protected int protected_c=300;
    public int public_d=400;

    public Protection()
    {
        System.out.println("private_a :"+private_a);
        System.out.println("default_b :"+default_b);
        System.out.println("protected_c :"+protected_c);
        System.out.println("public_d :"+public_d);
        System.out.println("++++++++++++++");
    }

}
