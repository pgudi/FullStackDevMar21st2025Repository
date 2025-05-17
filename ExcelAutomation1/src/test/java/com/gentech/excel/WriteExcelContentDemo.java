package com.gentech.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class WriteExcelContentDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;
        try
        {

            wb= new XSSFWorkbook();
            sh=wb.createSheet("Information");
            row=sh.createRow(0);
            cell=row.createCell(0);
            cell.setCellValue("UserName");
            cell=row.createCell(1);
            cell.setCellValue("Password");

            row=sh.createRow(1);
            cell=row.createCell(0);
            cell.setCellValue("admin");
            cell=row.createCell(1);
            cell.setCellValue("welcome123");

            fout=new FileOutputStream("D:\\EXCEL\\Welcome.xlsx");
            wb.write(fout);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
                wb.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
