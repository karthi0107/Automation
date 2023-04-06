package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkss {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement> alinks = driver.findElements(By.xpath("//a"));
int count = alinks.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	String text = alinks.get(i).getText();
	System.out.println(text);
}

for(WebElement i:alinks)
{
	String text = i.getText();
	System.out.println(text);
}


driver.close();

	}

}
