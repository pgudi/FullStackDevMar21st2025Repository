package com.gentech.serializationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFromFileDemo {
    public static void main(String[] args) {
        deserialization();
    }

    private static void deserialization()
    {
        FileInputStream fin=null;
        ObjectInputStream in=null;
        Employee employeeObject=null;
        try
        {
            fin=new FileInputStream("D:\\Demo\\Test\\Employee.ser");
            in=new ObjectInputStream(fin);

            employeeObject=(Employee) in.readObject();

            employeeObject.showFirstName("Santosh");
            employeeObject.showCityName("Dallas");
            employeeObject.showJobName("Sales");
            employeeObject.showSalary(25000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {

            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
