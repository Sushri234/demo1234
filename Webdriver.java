package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
	   // driver.manage().deleteAllCookies();
	//driver.navigate().back();
	 //driver.navigate().forward();
		//driver.findElement(By.name("firstname")).sendKeys("suprava");
		//driver.findElement(By.xpath("//input[div@mbs _52lq _9bp_ fsl fwb fcb='surname']")).sendKeys("sanju");
		//driver.findElement(By.id("location")).sendKeys("patia")
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.id("email")).sendKeys("sush");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("fuzzy");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[starts-with(input,u_0_0")).click();
		
		

	}
	

}
