package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebElement;

 public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		//File
		File f=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MavenProject\\files\\task.xlsx");
		
		//Fileinputstream
		
		FileInputStream fi=new FileInputStream(f);
		
		
		//workbook
		
		Workbook w=new XSSFWorkbook(fi);
		
		//sheet
		Sheet s = w.getSheet("Sheet1");
		
		//row
		Row r = s.getRow(3);
	//	System.out.println(r);
		
		Cell c = r.getCell(0);
		System.out.println(c);
		
	//	WebElement e;
	//	e.sendKeys(cell);
		
	//	String s1 = c.toString();
	//	e.sendKeys(s1);
		
		//rowcount
		int rowcount = s.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		int cellcount = r.getPhysicalNumberOfCells();
		System.out.println(cellcount);
		
		
//		//get all values
//		for (int i=0; i<rowcount; i=i+1) {
//			Row row = s.getRow(i);
//			for(int j=0;j<cellcount; j++) {
//				Cell cell = row.getCell(j);
//				System.out.println(cell);
//			}
//		}
		
		//Type1----> String (name)
		//Type0------>Numbers,date
		
		int cellType = c.getCellType();
		System.out.println(cellType);
		
		if(cellType==1) {
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat si=new SimpleDateFormat("dd/MMM/yyyy");
				String format = si.format(dateCellValue);
				System.out.println(format);
				
			}
			else {
				double db = c.getNumericCellValue();
				long ln=(long)db;
				String valueOf = String.valueOf(ln);
				System.out.println(valueOf);
			}
		}	
	}

}
