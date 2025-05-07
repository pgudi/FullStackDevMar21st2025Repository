package com.gentech.stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        appendString();
        insertString();
        deleteString();
        reverseString();
    }

    static void appendString()
    {
        StringBuilder s=new StringBuilder("Java");
        System.out.println(s);
        s.append(" Programming");
        System.out.println(s);
        System.out.println("-----------------");
    }

    static void insertString()
    {
        StringBuilder s=new StringBuilder("It is a book");
        StringBuilder str=s.insert(8, "new ");
        System.out.println("Insert String:"+str);
        System.out.println("-----------------");
    }

    static void deleteString()
    {
        StringBuilder s=new StringBuilder("It is a new book");
        StringBuilder str=s.delete(8, 12);
        System.out.println("Delete String:"+str);
        System.out.println("-----------------");
    }

    static void reverseString()
    {
        StringBuilder s=new StringBuilder("Gentech");
        StringBuilder str=s.reverse();
        System.out.println("Reverse String:"+str);
        System.out.println("-----------------");
    }
}
