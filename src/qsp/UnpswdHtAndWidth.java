package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnpswdHtAndWidth {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	int h1 = driver.findElement(By.id("username")).getSize().getHeight();
	int h2 = driver.findElement(By.id("pwd")).getSize().getHeight();
	int w1 = driver.findElement(By.id("username")).getSize().getWidth();
	int w2 = driver.findElement(By.id("pwd")).getSize().getWidth();
	
	if(h1==h2&&w1==w2)
	{
		System.out.println("HEIGTH AND WIDTH ARE EQUAL AND PASS");
	}
	else
	{
		System.out.println("HEIGTH AND WIDTH ARE NOT EQUAL AND FAIL");
	}
	driver.close();
	
	}
}
