package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tagname = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		//System.out.println(tagname);
		/*if(tagname.equals("a"))
		{
			System.out.println("TAGNAME IS a");
		}
		else {
			System.out.println("TAGNAME IS NOT a");
		}*/
		driver.close();

	}
}
