package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_automating {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]")).click();
		
		
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
		}
			driver.findElement(By.xpath("(//a[@class=\"ui-state-default ng-tns-c58-10 ng-star-inserted\"])[10]")).click();
		}




	}



