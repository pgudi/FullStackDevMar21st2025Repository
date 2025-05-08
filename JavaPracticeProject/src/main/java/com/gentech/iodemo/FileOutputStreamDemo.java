package com.gentech.iodemo;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout=null;
        try
        {
            fout=new FileOutputStream("D:\\Demo\\Test\\Welcome1.txt",true);
            String str="Bangalore is a capital city of Karnataka";
            str+=", Bangaloer is also called as garden city.";
            byte b[]=str.getBytes();
            fout.write(b);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
