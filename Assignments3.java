package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> elements =driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}
		}
		

	}


