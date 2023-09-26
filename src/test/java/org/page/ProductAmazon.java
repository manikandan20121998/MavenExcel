package org.page;

import java.util.Set;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAmazon extends BaseClass {
	
	public ProductAmazon() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement serach;
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement firstlink;
	
	@FindBy(id="add-to-cart-button")
	private WebElement add;
	
	
	
	
	
	public WebElement getAdd() {
		return add;
	}
	public WebElement getSerach() {
		return serach;
	}
	public WebElement getFirstlink() {
		return firstlink;
	}

	
	public void getproduct(String name) {
		sendkeysenter(getSerach(), name);
		click(getFirstlink());	
	}
	
	public void getwindowhandle() {
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		
		for (String x:all) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		scrolldown(getAdd());
		
	click(getAdd());
	}
	
	
	
	
	
	
	
	

}
