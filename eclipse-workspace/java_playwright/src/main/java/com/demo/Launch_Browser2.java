package com.demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;

public class Launch_Browser2 {

	public static void main(String[] args) {


		try {
			Playwright Playwright2 = Playwright.create();

			//Browser bw =Playwright2.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));

			
			Browser bw =Playwright2.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext cc = bw.newContext();

			Page page = cc.newPage();

			
			System.out.println("step-1");
			page.navigate("https://excellonsoft.com");
			
//			page.navigate("https://excellonsoft.com", new Page.NavigateOptions()
//			        .setWaitUntil(Page.LoadState.LOAD)
//			);
			
			
			System.out.println("Page opened: " + page.title());

			// Wait for 4 seconds

			page.waitForTimeout(4000);

			System.out.println("Waited for 4 seconds before closing.");

			// Optionally close browser
			bw.close();

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
