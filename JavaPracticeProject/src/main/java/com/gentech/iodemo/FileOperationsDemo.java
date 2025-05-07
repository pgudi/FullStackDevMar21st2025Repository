package com.gentech.iodemo;

import java.io.File;

public class FileOperationsDemo {
    public static void main(String[] args) {
     //   createFile();
     //   renameFile();
     //   deleteFile();
        fileCollections();
    }

    private static void createFile()
    {
        try
        {
            File f1=new File("D:\\Demo\\Test\\Welcome.txt");
            f1.createNewFile();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private static void renameFile()
    {
        File f1=new File("D:\\Demo\\Test\\Welcome.txt");
        File f2=new File("D:\\Demo\\Test\\WelcomeNew.txt");
        f1.renameTo(f2);
    }

    private static void deleteFile()
    {
        File f2=new File("D:\\Demo\\Test\\WelcomeNew.txt");
        boolean v1=f2.delete();
        System.out.println("Is File Deleted ?:"+v1);
    }

    private static void fileCollections()
    {
        File f1=new File("D:\\Demo\\Test");
        File arr[]=f1.listFiles();
        for(int i=0;i<arr.length;i++)
        {
            File f2=arr[i];
            if(f2.isFile()==true)
            {
                System.out.println(f2.getPath());
            }
        }
    }
}
