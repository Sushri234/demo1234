package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_practice {

	private static int i;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(list.size());
		
		for (int i=0;i<list.size();i++);
		{
			System.out.println(list.get(i).getAttribute("value"));
		}
		
		
		

	}

}
