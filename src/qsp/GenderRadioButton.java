package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioButton {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		int female = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		//Thread.sleep(2000);
		int male = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		//Thread.sleep(2000);
		int custom = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		//Thread.sleep(2000);
		
		if(female==male&&female==custom)
		{
			System.out.println("GENDER RADIO BUTTON ALIGNMENT ARE EQUAL");
		}
		else
		{
			System.out.println("GENDER RADIO BUTTON ALIGNMENT ARE NOT EQUAL");
		}
	
		driver.close();
	}
	

}
