package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("jkgjyfy");
		//driver.findElement(By.xpath("//button")).click();
		//driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		//driver.findElement(By.id("email")).sendKeys("popop");
		//driver.findElement(By.name("pass")).sendKeys("gtgjgh");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("gdggyyf");
		
		

	}

}
