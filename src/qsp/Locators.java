package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Locators {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/Dell/Desktop/Demo.html");
			
			
			//WebElement e= driver.findElement(By.tagName("a"));
			//e.click();
			
			driver.findElement(By.tagName("a")).click();//code optimization above code
			Thread.sleep(1000);
			driver.navigate().back();
			driver.findElement(By.id("d1")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			driver.findElement(By.className("c1")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			driver.findElement(By.name("n1")).click();
			driver.close();
			
	
			
			
			
			


	}

}
