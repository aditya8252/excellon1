package com.demo;

import com.microsoft.playwright.Playwright;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello World");
		
		String name = "Playwright";
		
		
		Playwright playwright = Playwright.create();	
		
		playwright.chromium().launch(new com.microsoft.playwright.BrowserType.LaunchOptions().setHeadless(false)).newContext().newPage().navigate("https://wikipedia.com");
		
		
		
		

	}

}
