package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("Sushree");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sangita");
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).click();

	}
}
