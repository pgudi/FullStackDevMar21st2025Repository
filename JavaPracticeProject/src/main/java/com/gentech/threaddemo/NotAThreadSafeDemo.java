package com.gentech.threaddemo;
class MyClass1 implements Runnable
{

    @Override
    public void run() {
        showEvenNumbers();
    }

    void showEvenNumbers()
    {
        try
        {
            System.out.println("Even Numbers:");
            for(int i=10;i<=30;i++)
            {
                Thread.sleep(1000);
                if(i%2==0)
                {
                    System.out.println(Thread.currentThread().getName()+" Displays Even Number :"+i);
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class NotAThreadSafeDemo {
    public static void main(String[] args) {
        MyClass1 job=new MyClass1();

        Thread t1=new Thread(job);
        t1.setName("alpha");
        t1.start();
        Thread t2=new Thread(job);
        t2.setName("amega");
        t2.start();
    }
}
