package com.gentech.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        readContent();
    }

    private static void readContent()
    {
        FileReader fr=null;
        BufferedReader br=null;
        try
        {
            fr=new FileReader("D:\\Demo\\Test\\Sample.txt");
            br=new BufferedReader(fr);

            String strLine="";
            while((strLine=br.readLine())!=null)
            {
                System.out.println(strLine);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fr.close();
                br.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
