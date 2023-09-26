package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


//base class la ( main method and sysout ) eruka kudathu

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver chromebrowser() {
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   return driver;
	}
	
	public static WebDriver firefoxbrowser() {
		WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
		   return driver;
	}
	
	public static WebDriver edgebrowser() {
		WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
		   return driver;
	}	
	
	public static void urllaunch(String url) {
		driver.get(url);

	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void implicitywait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}
	
	public static  void click(WebElement e) {
		e.click();

	}
	
	public static void sendkeysenter(WebElement e,String value) {
		e.sendKeys(value,Keys.ENTER);
	}
	
	public static void sendkeys(WebElement e,String user) {
		e.sendKeys(user);

	}

	public static void quit() {
		driver.quit();
	}
	
	public static String currenturl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String title() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String getattribute(WebElement e) {
		String att = e.getAttribute("value");
		return att;
			
	}
	
	public static void movetoelement(WebElement e) {
		Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	}
	
	public static void selectbyindex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	
	public static String gettext(WebElement e) {
		String text = e.getText();
		return text;
	}
	
	public static  void doubleclick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	
	public static void contextclick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
	
	public static void clear(WebElement e) {
		e.clear();
	}
	
	public static Alert accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}
	
	public static Alert dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		return alert;
	}
	
	public static void selectbyvalue(WebElement e, String value) {
		Select s=new Select(e);
		s.selectByValue("value");
	}
	
	public static  void selectbyvisibletext(WebElement e,String text) {
		Select s=new Select(e);
		s.selectByVisibleText("text");
	}
	
	public static List<WebElement> getoptions(WebElement e) {
		Select s=new Select(e);
		return s.getOptions();
		
	}
	
	public static List<WebElement> getallselectdoptions(WebElement e) {
		Select s=new Select(e);
		return s.getAllSelectedOptions();
				
	}
	
	public static List<WebElement> getfirstselectedoption(WebElement e) {
		Select s=new Select(e);
       s.getFirstSelectedOption();
	return null;
	}
	
	public static void ismultiple(WebElement e) {
		Select s=new Select(e);
		s.isMultiple();
	}
	
	public static void deselectbyindex(WebElement e,int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);
	}
	
	public static void deselectbyvalue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue("value");
	}
	
	public static void deselectbyvisibletext(WebElement e,String text) {
		Select s=new Select(e);
		s.deselectByVisibleText("text");
	}
	
	public static void deselectall(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	
	public static void jeexecute(WebElement e,String text) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('value','"+text+"')", e);
	}
	
	public static void jeclick(WebElement e) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()", e);
	}
	
	public static void scrolldown(WebElement e) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	
	public static void scrollup(WebElement e) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	
	public static Object jegetattribute(WebElement e) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		Object executeScript = je.executeScript("return arguments[0].getAttribute('value')", e);
		return executeScript;
	}
	
	public static void switchtoframe(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}
	
	public static void parentframe() {
		driver.switchTo().parentFrame();
	}
	
//	 public static String  getwindowhandle() {
//		String parent = driver.getWindowHandle();
//		return parent;
//		
//	}
//	public static Set<String> getwindowhandles() {
//		Set<String> all = driver.getWindowHandles();
//		return all;
//		
//	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
    public static boolean isdisplayed(WebElement e) {
         boolean displayed = e.isDisplayed();
		return displayed;
	}
	
	public static boolean isselected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;
	}
	
	public static boolean isenabled(WebElement e) {
		boolean enabled = e.isEnabled();
		return enabled;
		
	}
	
	public static void draganddrop(WebElement e,WebElement e1) {
		Actions a=new Actions(driver);
		a.dragAndDrop(e, e1).perform();
	}
	
	public static void screenshot(String projectname,String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\eclipse-workspace\\"+projectname+"\\Screenshot\\"+name+".png");
		FileUtils.copyFile(src, des);
	}
	
	//Excel
	public static String getExcel(String excelname,String sheetno,int rowno,int cellno) throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\files\\"+excelname+".xlsx");
	   FileInputStream fi=new FileInputStream(f);
	   Workbook w=new XSSFWorkbook(fi);
	   Sheet sheet = w.getSheet(sheetno);
	   Row row = sheet.getRow(rowno);
	   Cell cell = row.getCell(cellno);
	   int type = cell.getCellType();
	   String value;
	   if (type==1) {
		 value = cell.getStringCellValue();	
	}
	  else {
		if (DateUtil.isCellDateFormatted(cell)) {
			 value = new SimpleDateFormat("dd/MMM/yyyy").format(cell.getDateCellValue());	
		}
		else {
			 value = String.valueOf((long)cell.getNumericCellValue());	
		}
	}
	   return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
