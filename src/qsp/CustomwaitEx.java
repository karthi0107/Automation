package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomwaitEx {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	/*	//CUSTOM WAIT 
		int i=0;
		while(i<=100) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(Exception e) {
				i++;
			}}*/
		
		//another way
		while(true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(Exception e) {
				System.out.println("CUSTOM WAITING");
			}
		}
		driver.close();
	}

}
