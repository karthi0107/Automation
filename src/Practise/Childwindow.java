package Practise;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		System.out.println("enter the value");
		
		Scanner sc=new Scanner(System.in);
		
		String etitle = sc.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		/*String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			if(!wh.equals(pwh)) {
			driver.close();
			}
		}*/
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String atitle = driver.getTitle();
			if(atitle.equals(etitle)) {
				driver.close();
			}
		}
	driver.close();
	}
	
}
