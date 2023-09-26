package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		
		//file
		File f=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MavenProject\\files\\task.xlsx");
//	//	workbook
//		Workbook w=new XSSFWorkbook();
//		//sheet
//		Sheet s = w.createSheet();
//		//row
//		Row row = s.createRow(2);
//		//cell
//		Cell cell = row.createCell(3);
//		cell.setCellValue("manimaddy");
//		System.out.println(cell);
		
		FileInputStream fi=new FileInputStream(f);
	//	Workbook w=new XSSFWorkbook(fi);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(2);
		Cell cell = r.createCell(1);
		cell.setCellValue("mani");
		System.out.println(cell);
		
		
		
		
		
//		//Existing sheet
//		FileOutputStream fo=new FileOutputStream(f);
//		w.write(fo);
//		System.out.println("done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
