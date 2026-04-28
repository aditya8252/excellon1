package com.demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser1 {

	public static void main(String[] args) {

		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext Browsercontext = browser.newContext();
		Page page = Browsercontext.newPage();
		
		page.navigate("https://flipkart.com");
		page.waitForLoadState();   // wait for page to load
		
		String a = page.title();
		System.out.println("Title of the page is : " + a);
		
		 page.screenshot(new Page.ScreenshotOptions().setPath(java.nio.file.Paths.get("C:\\test\\screenshot.png")));
		 
		 System.out.println("sc capture");
		
		//page.waitForTimeout(4000);
		
		//page.close();
		
		
		
		
	}

}
