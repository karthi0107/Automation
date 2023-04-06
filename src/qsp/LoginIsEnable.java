package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIsEnable {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean loginbutton = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();////also we can use By.name also
		
		if(loginbutton==true)
		{
			System.out.println("login button is enable");
		}
		else {
			System.out.println("login button is disenable");
		}
		driver.close();	
	}

}
