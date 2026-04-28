package com.demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Launch_newb {

	public static void main(String[] args) {

		
		Playwright playwright= Playwright.create();
		
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context = browser.newContext();
		Page page=context.newPage();
		System.out.println("step-1");
		page.navigate("https://demowebshop.tricentis.com/");
		
		//page.locator("#(//li[@class='inactive'])[1]").click();		
		
//		page.locator("(//li[@class='inactive'])[1]").click();
//		page.waitForLoadState();
		
		//page.locator("(//li[@class='inactive'])[1]").click(new Locator.ClickOptions().setForce(true));
		
		page.locator("div.block.block-category-navigation li:nth-child(1) a").click();		
		System.out.println("step-2");
		
	}

}
