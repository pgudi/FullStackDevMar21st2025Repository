package com.gentech.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
    public static void main(String[] args) {
    //    findIntegerValue1();
    //    findIntegerValue2();
    //    replaceMatch();
    //    sumOfNumbersInString();
        sumOfNumbersInString2();
    }

    private static void findIntegerValue1()
    {
        Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
        String str="Bangalore received 101 milimeter of rain yesterday";
        Matcher match = pattern.matcher(str);
        boolean v1=match.find();
        System.out.println(v1);
    }

    private static void findIntegerValue2()
    {
        Pattern pattern=Pattern.compile("[0-9]{3}");
        String str="Bangalore received 101 milimeter of rain yesterday";
        Matcher match = pattern.matcher(str);
        boolean v1=match.find();
        System.out.println(v1);
    }

    private static void replaceMatch()
    {
        Pattern pattern=Pattern.compile("[0-9]{3}");
        String str="Bangalore received 101 milimeter of rain yesterday";
        Matcher match = pattern.matcher(str);

        String v1=match.replaceAll("many");
        System.out.println(v1);
    }

    private static void sumOfNumbersInString()
    {
        Pattern pattern=Pattern.compile("[0-9]");
        String str="mango5apple9grapes4kiwi6peach";
        Matcher match = pattern.matcher(str);

        int sum=0;
        while(match.find())
        {
            sum=sum+Integer.parseInt(match.group());
        }
        System.out.println("Sum of Integers :"+sum);
    }

    private static void sumOfNumbersInString2()
    {
        Pattern pattern=Pattern.compile("[0-9]+");
        String str="mango15apple9grapes4kiwi126peach";
        Matcher match = pattern.matcher(str);

        int sum=0;
        while(match.find())
        {
            sum=sum+Integer.parseInt(match.group());
        }
        System.out.println("Sum of Integers :"+sum);
    }
}
