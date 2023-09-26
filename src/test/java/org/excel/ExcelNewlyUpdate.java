package org.excel;

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

public class ExcelNewlyUpdate {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MavenProject\\files\\task.xlsx");

		FileInputStream fi=new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(fi);
			
		Sheet sh = w.getSheet("Sheet1");
		
		Row ro = sh.getRow(2);
		
		
		Cell cell = ro.createCell(8);
		
		cell.setCellValue("Mailam");
	
		System.out.println(cell);
		
		FileOutputStream fo=new FileOutputStream(loc);
		
		w.write(fo);
		
	}
	
}
