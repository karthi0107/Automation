package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitEx {
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
//EXPLICIT WAIT METHOD
WebDriverWait wait=new WebDriverWait(driver, 10);
//wait.until(ExpectedConditions.titleIs("actiTime - Enter Time-Track"));// using titlesIs method 
wait.until(ExpectedConditions.titleContains("Enter"));// using titlecontains method
String title = driver.getTitle();
System.out.println(title);
driver.close();

	}

}
