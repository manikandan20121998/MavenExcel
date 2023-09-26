package org.sample;

import org.base.BaseClass;
import org.page.ProductAmazon;

public class AmazonLaunch extends BaseClass {
	
public static void main(String[] args) {
	
	chromebrowser();
	urllaunch("https://www.amazon.in/");
	maximize();
	implicitywait(10);
	ProductAmazon p=new ProductAmazon();
	p.getproduct("vivo");
	p.getFirstlink();
	p.getwindowhandle();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	

	
	
	

}
