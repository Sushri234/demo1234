package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@22.6759958,88.3297288,10z");//browser invoke
		driver.findElement(By.xpath("//body[1]/div[3]/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")).click();// direction
		// search
		driver.findElement(By.xpath("(//input[@class=\"tactile-searchbox-input\"])[4]")).sendKeys("puri");
		driver.findElement(By.xpath("(//input[@class=\"tactile-searchbox-input\"])[5]")).sendKeys("cuttack");
		driver.findElement(By.xpath("(//button[@class=\"mL3xi\"])[3]")).click();
		
}
}
