package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarpractice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[2]/td[6]/span")).click();
		
		//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[5]/td[1]/a
		//*[@id="jDate"]/span/div/div/div[2]/table/tbody/tr[2]/td[6]/span
	}

}

