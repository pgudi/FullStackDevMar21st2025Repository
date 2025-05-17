package com.gentech.threaddemo;
class MyClass2 implements Runnable
{

    @Override
    public void run() {
        showEvenNumbers();
    }

    synchronized void showEvenNumbers()
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
public class ThreadSafeDemo {
    public static void main(String[] args) {
        MyClass2 job=new MyClass2();

        Thread t1=new Thread(job);
        t1.setName("alpha");
        t1.start();
        Thread t2=new Thread(job);
        t2.setName("omega");
        t2.start();
    }
}
