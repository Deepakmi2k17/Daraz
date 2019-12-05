package org.deep.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base {
	public static String getData(int rowNo,int cellNo) throws IOException
	{
		String value=null;
		File loc=new File("C:\\Users\\Deepak\\eclipse-workspace\\Projectshop\\XL\\ph.xlsx");
		FileInputStream str=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(str);
		Sheet sh = w.getSheet("Sheet1");
		Row ro = sh.getRow(rowNo);
		Cell cl = ro.getCell(cellNo);
		
		 value = cl.getStringCellValue();
		return value;
		 
		
		
	}

}
