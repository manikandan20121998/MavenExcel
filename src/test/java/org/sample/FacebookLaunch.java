package org.sample;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page.LoginPage;

public class FacebookLaunch extends BaseClass {

	public static void main(String[] args) throws IOException {

		chromebrowser();
		urllaunch("https://facebook.com/");
		implicitywait(10);
		LoginPage l = new LoginPage();
//		l.getlogin("mani", "4555455");
     sendkeys(l.getTxtusername(), getExcel("sample", "Sheet1", 1, 1));
     sendkeys(l.getPassword(), getExcel("sample", "Sheet1", 1, 3));
     click(l.getBtnlogin());
	}
}
