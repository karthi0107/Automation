package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//OPEN THE BROWSER
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//ENTER THE URL
		driver.get("https://www.google.com/");
		//TYPE JAVA IN SEARCH TEXTBOX
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("java");

		Thread.sleep(2000);
		//FIND ALL SUGGESSTION & PRINT THE COUNT
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allSugg.size();
		System.out.println(count);
		//PRINT THE TEXT OF ALL AUTOSUGGESSTION
		for(int i=0;i<count;i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		//SELECT THE FIRST AUTOSUGGESSTION
		allSugg.get(0).click();
		driver.close();
	}
}
