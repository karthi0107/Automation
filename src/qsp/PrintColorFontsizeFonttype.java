package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColorFontsizeFonttype {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		String fontsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String fonttype = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		
		System.out.println(color);
		System.out.println(fontsize);
		System.out.println(fonttype);
		driver.close();
	}		
}
	
