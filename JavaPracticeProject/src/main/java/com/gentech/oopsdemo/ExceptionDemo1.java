package com.gentech.oopsdemo;
class StringTest
{
    static int getCharacterCount(String str) throws Exception
    {
        if(str==null)
        {
            throw new Exception("The Given Input is null, please provide valid input to get Character count");
        }
        return str.length();
    }
}
public class ExceptionDemo1 {
    public static void main(String[] args) {
        try
        {
            int v1=StringTest.getCharacterCount("Welcome");
            System.out.println("# of Chars :"+v1);
            int v2=StringTest.getCharacterCount(null);
            System.out.println("# of Chars :"+v2);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
