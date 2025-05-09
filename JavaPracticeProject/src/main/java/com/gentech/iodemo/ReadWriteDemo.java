package com.gentech.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ReadWriteDemo {
    public static void main(String[] args) {
        readWrite();
    }

    private static void readWrite()
    {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        int n=0;
        try
        {
            fin=new FileInputStream("D:\\Demo\\Test\\Sample.txt");
            fout=new FileOutputStream("D:\\Demo\\Test\\SampleNew.txt");
            while(true)
            {
                n=fin.read();
                if(n==-1)
                {
                    break;
                }
                fout.write(n);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                fout.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
