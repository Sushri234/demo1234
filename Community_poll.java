package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Community_poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[2]")).click();
		driver.findElement(By.id("vote-poll-1")).click();

	}

}
