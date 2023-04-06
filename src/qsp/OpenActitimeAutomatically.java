package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenActitimeAutomatically {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click(); //USE TO CLICK LOGIN BUTTON
		
		//driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']")).click();
		//driver.findElement(By.xpath("//a[@class='item']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("logoutLink")).click();      //by.xpath("//a[@id='logoutLink']")...........USE TO LOGOUT
		
		//driver.findElement(By.id("username")).sendKeys("admin");

		driver.close();
		
		
		
}
}

