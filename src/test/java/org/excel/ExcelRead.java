package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ExcelRead {
	public static void main(String[] args) throws IOException  {
		
		File loc=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MavenProject\\files\\sample.xlsx");
		
		FileInputStream fi=new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(fi);
				
		Sheet sh = w.getSheet("Sheet1");
		
		Row r = sh.getRow(3);
		
		Cell c = r.getCell(2);
		
		System.out.println(c);
		
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row ro = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell cell = r.getCell(j);
				System.out.println(cell);
				
			}
		}
		
	}	
}
