package com.basicsoftwareTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenBasicTest4 {
	
	@org.testng.annotations.Test
	public void Test()
	{
		//System.setProperty("webdriver.ie.driver", "C:/Users/Neha-/Documents/Selenium/Selenium Software/IEDriverServer_Win32_3.13.0/IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Neha-\\Documents\\Selenium\\Selenium Software\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neha-\\Documents\\Selenium\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://docs.seleniumhq.org/");
		System.out.println("Page Title is:" + driver.getTitle());
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Selenium");
		}

}
