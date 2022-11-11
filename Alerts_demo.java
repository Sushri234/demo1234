package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_demo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		//Thread.sleep(2000);
	
		//driver.findElement(By.id("promptBox")).click();
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		//Thread.sleep(2000);
		simpleAlert.accept();
		//Thread.sleep(2000);
		//driver.quit();
	

	}

}
