package com.demo.auto1.test_playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Aditya {

	public static void main(String[] args) {

		System.out.println("step - 1");
		Playwright playwright = Playwright.create();
		
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page =browser.newPage();
		page.navigate("https:wikipedia.com");
		System.out.println("test-pp");
		
		page.getByLabel("Search Wikipedia").fill("bharat");
        page.locator("i:has-text('Search')").click();
        
        page.mouse().wheel(0, 500);		
		
        page.waitForTimeout(5000);
		page.close();
	}

}
