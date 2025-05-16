package com.gentech.utildemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
    //    writeContent();
        readContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout=null;
        Properties prop=null;
        try
        {
            fout=new FileOutputStream("D:\\Demo\\Test\\example.properties");
            prop=new Properties();

            prop.setProperty("username","admin");
            prop.setProperty("password","manager");
            prop.setProperty("otp","1991");

            prop.store(fout, "It is for Testing purpose");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
                prop.clear();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void readContent()
    {
        FileInputStream fin=null;
        Properties prop=null;
        try
        {
            fin=new FileInputStream("D:\\Demo\\Test\\example.properties");
            prop=new Properties();

            prop.load(fin);

            String v1=prop.getProperty("username");
            System.out.println(v1);
            String v2=prop.getProperty("password");
            System.out.println(v2);
            String v3=prop.getProperty("otp");
            System.out.println(v3);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
