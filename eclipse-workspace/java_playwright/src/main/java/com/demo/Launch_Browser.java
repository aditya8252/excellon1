package com.demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Launch_Browser {

	public static void main(String[] args) {

		try {
			Playwright playwright = Playwright.create();

			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			System.out.println("Headless browser launched.");

			BrowserContext browsercontext = browser.newContext();

			Page page = browsercontext.newPage();

			page.navigate("https://wikipedia.com");
			
			page.waitForTimeout(4000);
			
			
			System.out.println("Page opened: " + page.title());

			System.out.println("Navigating to Example.com complete.");

			browser.close();
			browser.close();
			System.out.println("Browsers closed successfully.");

		} catch (Exception e) {

		}

	}

}
