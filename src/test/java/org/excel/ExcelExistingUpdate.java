package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExistingUpdate {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MavenProject\\files\\task.xlsx");
		FileInputStream fi=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(fi);
		Sheet sh = w.getSheet("Sheet1");
		Row ro = sh.getRow(2);
		Cell ce = ro.getCell(1);
		int type = ce.getCellType();
		String value;
	    if (type==1) {
			 value = ce.getStringCellValue();
		}
		else {
			if (DateUtil.isCellDateFormatted(ce)) {
			Date date = ce.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yyyy");
			 value = sim.format(date);
			}
		else {
			double db = ce.getNumericCellValue();
			long ln=(long)db;
			 value = String.valueOf(ln);
		}
		}
	    
		if (value.equals("6736")) {
			ce.setCellValue("Mani");
		}
		System.out.println(ce);
		FileOutputStream fo=new FileOutputStream(loc);
		w.write(fo);
	}}
