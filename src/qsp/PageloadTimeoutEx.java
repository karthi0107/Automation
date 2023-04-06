package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageloadTimeoutEx {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// USING PAGELOADTIMEOUT
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com/");
			System.out.println("PAGE IS LOADED WITH IN 10 SECONDS");
		}
		catch(Exception e) {
			System.out.println("PAGE IS NOT LOADED WITH IN 10 SECONDS");
		}
		driver.close();
	}

}
