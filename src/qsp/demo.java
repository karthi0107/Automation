package qsp;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		RemoteWebDriver d;// to find the source code for this class
		
		WebDriver j;//
		
		SearchContext s;
		
		
	}

}
