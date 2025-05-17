package com.gentech.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
    public static void main(String[] args) {
    //    matchesDemo();
    //    findDemo();
    //    countOfMatching();
    //    displayMatching();
    //    replaceDemo();
        splitDemo();
    }

    private static void matchesDemo()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match = pattern.matcher("Welcome");
        boolean v1=match.matches();
        System.out.println(v1);
    }

    private static void findDemo()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match = pattern.matcher("Welcome Morning Hello Welcome");
        boolean v1=match.find();
        System.out.println(v1);
    }

    private static void countOfMatching()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match = pattern.matcher("Welcome Morning Hello Welcome");
        int count=0;
        while(match.find())
        {
            count++;
        }
        System.out.println("# of Occurance:"+count);
    }

    private static void displayMatching()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match = pattern.matcher("Welcome Morning Hello Welcome");

        while(match.find())
        {
            System.out.println(match.group());
        }

    }

    private static void replaceDemo()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match = pattern.matcher("Welcome Morning Hello Welcome");

        String v1=match.replaceAll("Greeting");
        System.out.println(v1);
    }

    private static void splitDemo()
    {
        Pattern pattern=Pattern.compile("[!@#$%^]");
        String str[] = pattern.split("Apple!mango@Grames#Banana$Orange%");
        for(String s:str)
        {
            System.out.println(s);
        }
    }

}
