package com.demo;

import javax.naming.Context;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.util.regex.Pattern;

public class Launch_browser3 {

	public static void main(String[] args) {
		
		try {

		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 
		 BrowserContext  browserContext = browser.newContext();
		 
		Page page= browserContext.newPage();
		
		System.out.println("step-1");
		
		page.navigate("https://wikipedia.com");
		
		String expectedTitle = page.title();
		
		String actualTitle = "wikipedia";
		
		System.out.println("actualTitle : " + actualTitle);
		
		// assertEquals(expectedTitle, actualTitle);
		 
		// assertThat(page).hasTitle(Pattern.compile("Playwright"));
		 
		 assertThat(page).hasTitle("Wikipedia");
		
		//assertEquals(actualTitle, expectedTitle);
		
		//assert expectedTitle.equals(actualTitle);
		
		
		 page.close();
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}

}
	
}
