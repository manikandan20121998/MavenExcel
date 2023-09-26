package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNewWrite {
public static void main(String[] args) throws IOException {
	
	File loc=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MavenProject\\files\\sim.xlsx");
	FileOutputStream fo=new FileOutputStream(loc);
	Workbook w=new XSSFWorkbook();
	w.write(fo);
	Sheet sheet = w.createSheet("Sheet1");
	
	Row row = sheet.createRow(4);
	
	
	Cell cell = row.createCell(2);
	
	cell.setCellValue("Jesus");
	String value = cell.getStringCellValue();
	if (value.equals("Jesus")) {
		cell.setCellValue("Jesus+Perumal");
	}
	
	System.out.println(cell);
	
	
	
	
	
	
	
	
	
	
	
}
}
