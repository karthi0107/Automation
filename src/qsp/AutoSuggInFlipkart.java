package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggInFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//OPEN THE BROWSER
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//ENTER THE URL
		driver.get("https://www.flipkart.com/");
		//TYPE IPHONE IN SEARCH TEXTBOX
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);

		//FIND ALL SUGGESSTION & PRINT THE COUNT
		List<WebElement> flipkart = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
		int count = flipkart.size();
		System.out.println(count);
		//PRINT THE TEXT OF ALL AUTOSUGGESSTION
		for(WebElement i:flipkart)
		{
			String text = i.getText();
			System.out.println(text);
		}
		//SELECT THE LAST AUTOSUGGESSTION
		flipkart.get(count-1).click();
		Thread.sleep(2000);
		driver.close();
	}
}
