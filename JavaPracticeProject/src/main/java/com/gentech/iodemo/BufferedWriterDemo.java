package com.gentech.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        BufferedWriter bw=null;
        try
        {
            bw=new BufferedWriter(new FileWriter("D:\\Demo\\Test\\Welcome3.txt",true));
            bw.write("Java is a programming language.");
            bw.newLine();
            bw.write("Java supports OOPS Concepts.");
            bw.newLine();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                bw.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
