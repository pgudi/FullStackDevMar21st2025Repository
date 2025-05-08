package com.gentech.iodemo;

import java.io.File;

public class FolderOperationsDemo {
    public static void main(String[] args) {
     //   createFolder();
     //   createNestedFolder();
     //   renameFolder();
     //   deleteFolder();
        folderCollections();
    }

    private static void createFolder()
    {
        File f1=new File("D:\\Demo\\Test\\Welcome");
        f1.mkdir();
    }

    private static void createNestedFolder()
    {
        File f1=new File("D:\\Demo\\Test\\N1\\N2\\N3\\N4");
        f1.mkdirs();
    }

    private static void renameFolder()
    {
        File f1=new File("D:\\Demo\\Test\\Welcome");
        File f2=new File("D:\\Demo\\Test\\WelcomeNEW");
        f1.renameTo(f2);
    }

    private static void deleteFolder()
    {
        File f2=new File("D:\\Demo\\Test\\WelcomeNEW");
        f2.deleteOnExit();
    }

    private static void folderCollections()
    {
        File f1=new File("D:\\Demo\\Test");
        File arr[]=f1.listFiles();
        for(int i=0;i<arr.length;i++)
        {
            File f2=arr[i];
            if(f2.isDirectory()==true)
            {
                System.out.println(f2.getPath());
            }
        }
    }
}
