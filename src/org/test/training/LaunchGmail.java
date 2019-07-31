package org.test.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\aswis\\project\\SeleniumTest\\Driver\\chromedriver.exe");
		
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.google.com/gmail/");
		driver.manage().window().maximize();

        driver.quit();
				
	}

}
