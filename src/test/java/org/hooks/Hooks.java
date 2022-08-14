package org.hooks;

import baseClass.org.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeLanch() {
		lanchBrowser();
		maxWindow();
		passUrl("https://www.facebook.com/");
		
		
	}
	

	@After
	public void aftrerLanch() {
		System.out.println("After Screenshot");
		
		driver.quit();
	}
}
