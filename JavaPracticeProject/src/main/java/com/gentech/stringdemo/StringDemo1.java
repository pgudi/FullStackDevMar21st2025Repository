package com.gentech.stringdemo;

import java.util.Locale;

public class StringDemo1 {
    public static void main(String[] args) {
        lower();
        upper();
        getLength();
        getCharacter();
        compareString1();
        compareString2();
        existanceOfString();
        replaceDemo();
        splitDemo();
        displayCharacters();
        convertToString();
        findPosition();
    }

    static void lower()
    {
        String s=new String("WELCOME");
        String s1=s.toLowerCase();
        System.out.println("Lowercase :"+s1);
        System.out.println("-----------------");
    }

    static void upper()
    {
        String s=new String("welcome");
        String s1=s.toUpperCase();
        System.out.println("Upper case:"+s1);
        System.out.println("-----------------");
    }

    static void getLength()
    {
        String s="Program";
        int v1=s.length();
        System.out.println("No of Characters :"+v1);
        System.out.println("-----------------");
    }

    static void getCharacter()
    {
        String s="PROGRAM";
        char ch=s.charAt(1);
        System.out.println("Character :"+ch);
        System.out.println("-----------------");
    }

    static void compareString1()
    {
        String s1="welcome";
        String s2="WELCOME";
        boolean v1=s1.equals(s2);
        System.out.println("s1 and s2 are equal :"+v1);
        boolean v2=s1.equalsIgnoreCase(s2);
        System.out.println("s1 and s2 are equal :"+v2);
        System.out.println("-----------------");
    }

    static void compareString2()
    {
        String s1="welcome";
        String s2="WELCOME";
        int v1=s1.compareTo(s2);
        System.out.println("s1 and s2 are equal :"+v1);
        int v2=s1.compareToIgnoreCase(s2);
        System.out.println("s1 and s2 are equal :"+v2);
        System.out.println("-----------------");
    }

    static void existanceOfString()
    {
        String str="Bangalore is garden city";
        boolean v1=str.startsWith("Bangalore");
        System.out.println("Starts With :"+v1);
        boolean v2=str.endsWith("city");
        System.out.println("Ends With :"+v2);
        boolean v3=str.contains("garden");
        System.out.println("Contains With :"+v3);
        System.out.println("-----------------");
    }

    static void replaceDemo()
    {
        String s="It is an old palace";
        String str=s.replace("is","was");
        System.out.println("Repalced Result:"+str);
        System.out.println("-----------------");
    }

    static void splitDemo()
    {
        String s="Mango,apple,Orange,Banana";
        String str[]=s.split(",");
        for(String val:str)
        {
            System.out.println(val);
        }
        System.out.println("-----------------");
    }

    static void displayCharacters()
    {
        String s="Welcome";
        char ch[]=s.toCharArray();
        for(char kk:ch)
        {
            System.out.println(kk);
        }
        System.out.println("-----------------");
    }

    static void convertToString()
    {
        int a=450;
        String s1=String.valueOf(a);
        System.out.println("Result:"+s1);
        double d=10.675;
        String s2=String.valueOf(d);
        System.out.println("Result:"+s2);
        System.out.println("-----------------");
    }

    static void findPosition()
    {
        String s="Welcome to GenTech Academy";
        int v1=s.indexOf("W");
        System.out.println("Position:"+v1);
        int v2=s.indexOf("GenTech");
        System.out.println("Position:"+v2);
        int v3=s.lastIndexOf("Academy");
        System.out.println("Position:"+v3);
        System.out.println("-----------------");
    }
}
