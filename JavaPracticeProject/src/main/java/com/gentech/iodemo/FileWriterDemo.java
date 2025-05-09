package com.gentech.iodemo;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileWriter fw=null;
        int n=0;
        try
        {
            fw=new FileWriter("D:\\Demo\\Test\\Welcome2.txt");
            String str="Bangalore is a capital city of Karnataka";
            str+=", Bangaloer is also called as garden city.";

            char ch[]=str.toCharArray();
            fw.write(ch);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fw.close();
            }catch (Exception e)
            {

            }
        }
    }
}
