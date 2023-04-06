package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectsClaass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Desktop/hotel.html");	
		ArrayList<String> al=new ArrayList<String>();
		//HashSet<String> al=new HashSet<String>();
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		int count=alloptions.size();
		for(WebElement i:alloptions) {
			String text = i.getText();
			//System.out.println(text);
			al.add(text);
		}
		
		Collections.sort(al);
		
		System.out.println(al);
		for(String it:al) {
			System.out.println(it);
		}
	driver.close();
	
	
	}

}
