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

public class ExcelUpdate {

	public static void main(String[] args) throws IOException {
		
		//ExcelUpdate
		//File
		File f=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MavenProject\\files\\task.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet0");
		Row r = s.getRow(2);
		Cell cell = r.getCell(1);
		String value = cell.getStringCellValue();
		if(value.equals("mani")) {
			cell.setCellValue("maddy");
		}
		System.out.println(cell);
		
		//Existing sheet
				FileOutputStream fo=new FileOutputStream(f);
				w.write(fo);
				System.out.println("done");
				
		
		
		
	}
	
	
	
	
	
	
}
