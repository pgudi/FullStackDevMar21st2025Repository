package com.gentech.iodemo;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        readContent();
    }

    private static void readContent()
    {
        FileReader fr=null;
        int n=0;
        try
        {
            fr=new FileReader("D:\\Demo\\Test\\Sample.txt");
            while(true)
            {
                n=fr.read();
                if(n==-1)
                {
                    break;
                }
                char ch=(char) n;
                System.out.print(ch);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fr.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
