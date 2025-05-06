package com.gentech.stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        appendString();
        insertString();
        deleteString();
        reverseString();
    }

    static void appendString()
    {
        StringBuffer s=new StringBuffer("Java");
        System.out.println(s);
        s.append(" Programming");
        System.out.println(s);
        System.out.println("-----------------");
    }

    static void insertString()
    {
        StringBuffer s=new StringBuffer("It is a book");
        StringBuffer str=s.insert(8, "new ");
        System.out.println("Insert String:"+str);
        System.out.println("-----------------");
    }

    static void deleteString()
    {
        StringBuffer s=new StringBuffer("It is a new book");
        StringBuffer str=s.delete(8, 12);
        System.out.println("Delete String:"+str);
        System.out.println("-----------------");
    }

    static void reverseString()
    {
        StringBuffer s=new StringBuffer("Gentech");
        StringBuffer str=s.reverse();
        System.out.println("Reverse String:"+str);
        System.out.println("-----------------");
    }
}
