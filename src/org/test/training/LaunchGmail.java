package org.test.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\aswis\\project\\SeleniumTest\\Driver\\chromedriver.exe");
		
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.google.com/gmail/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("aswinijayalakshmi@gmail.com");
		WebElement nxtbutton=driver.findElement(By.xpath("//span[text()='Next']"));
		nxtbutton.click();
		

        driver.quit();
				
	}

}
