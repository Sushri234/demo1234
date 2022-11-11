package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap_automate{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//WebElement loc =driver.findElement(By.xpath("//input[@id='searchboxinput']"));
		//loc.sendKeys("Puri");
		
		//loc.sendKeys(Keys.ENTER);
		
	
		
		// TODO Auto-generated method stub

	}

}
