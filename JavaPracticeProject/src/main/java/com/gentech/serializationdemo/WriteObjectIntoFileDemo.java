package com.gentech.serializationdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectIntoFileDemo {
    public static void main(String[] args) {
        serializedData();
    }

    private static void serializedData()
    {
        FileOutputStream fout=null;
        ObjectOutputStream out=null;
        Employee employeeObject=null;
        try
        {
            fout=new FileOutputStream("D:\\Demo\\Test\\Employee.ser");
            out=new ObjectOutputStream(fout);
            employeeObject=new Employee();

            out.writeObject(employeeObject);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
                out.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
