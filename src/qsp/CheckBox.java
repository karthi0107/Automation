package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		boolean cbox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();//also we can use By.id also
		if(cbox==true)
		{
			System.out.println("CHECKBOX IS SELECTED");
		}
		else {
			System.out.println("CHECKEDBOX IS NOT SELECTED");
		}
		driver.close();
		
	}

}
