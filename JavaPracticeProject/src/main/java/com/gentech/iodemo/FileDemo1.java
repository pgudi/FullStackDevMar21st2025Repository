package com.gentech.iodemo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //display File Name
        File f=new File("D:\\Demo\\Test\\Sample.txt");
        String v1=f.getName();
        System.out.println("File Name :"+v1);
        //display Parent Folder
        String v2=f.getParent();
        System.out.println("Parent Folder:"+v2);
        //display Parent Folder
        File f1=f.getParentFile();
        System.out.println("Parent Folder Name:"+f1);
        //File Path
        String path1=f.getPath();
        System.out.println("File Path:"+path1);
        //File Path
        String path2=f.getAbsolutePath();
        System.out.println("File Path:"+path2);
        //File Path
        File f2=f.getAbsoluteFile();
        System.out.println("File Path :"+f2);
        // Write Permission
        boolean b1=f.canWrite();
        System.out.println("Write Permission:"+b1);
        // Read Permission
        boolean b2=f.canRead();
        System.out.println("Read Permission:"+b2);
        // Execute Permission
        boolean b3=f.canExecute();
        System.out.println("Execute Permission:"+b3);
        //File Exists
        boolean b4=f.isFile();
        System.out.println("Is it a File :"+b4);
        //Directory Exists
        boolean b5=f.isDirectory();
        System.out.println("Is it a Folder :"+b5);
    }
}
