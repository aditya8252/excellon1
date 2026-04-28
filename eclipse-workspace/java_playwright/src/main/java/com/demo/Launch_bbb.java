package com.demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Launch_bbb {

	public static void main(String[] args) {

		
		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context = browser.newContext();
		
		Page page = context.newPage();
		
		page.navigate("http://wikipedia.com");
		page.waitForTimeout(5000);
		
		//page.waitForLoadState();
		System.out.println("aditya");
		
		//page.screenshot(new page.ScreenshotOptions())
		
		page.close();
		
		
	}

}
