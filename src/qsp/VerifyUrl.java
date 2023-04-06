package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
		{
			System.out.println("URL is navigating sucessfully and pass");
		}
		else
		{
			System.out.println("URL is not navigating and fail");
		}
driver.close();
	}

}
