package com.exceloperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException
	{
		File src=new File("C:\\Users\\admin\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		sheet.getRow(0).createCell(2).setCellValue("Results");
		sheet.getRow(1).createCell(2).setCellValue("Pass");
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();
	
	}

}
