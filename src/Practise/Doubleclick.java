package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.vtiger.com/");
	WebElement resourse = driver.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(driver);
	a.moveToElement(resourse).perform();	
	driver.findElement(By.partialLinkText("Customers")).click();

	WebElement btn = driver.findElement(By.id("nav_button_main"));
	a.doubleClick(btn).perform();
	String title = driver.getTitle();
	if(title.equals("Start Your Free Trial")) {
		System.out.println("title is displayed");
	}
	else {
		System.out.println("title is not displayed");
	}
}
}
