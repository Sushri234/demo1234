package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> c=driver.findElements(By.tagName("a"));
		int size=c.size();
		System.out.println(c.size());
		for (int i=1;i<c.size();i++)
		{
			WebElement a=c.get(i);
			String d=a.getText();
			System.out.println(d);
		}

	}

}
