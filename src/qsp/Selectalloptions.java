package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectalloptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Dell/Desktop/hotel.html");	
		WebElement mtr = driver.findElement(By.id("cp"));
		
		Select s=new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		int count=alloptions.size();
		
		for(int j=0;j<count;j++) {
			String text = alloptions.get(j).getText();
			boolean b=alloptions.get(j).isSelected();
			if(b==false) {
				System.out.println(text);
			}
						
		}
		driver.close();
		}}