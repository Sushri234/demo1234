package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_selenium {

	public static void main(String[] args) throws InterruptedException  {
		
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-\r\n"
				+ "in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.linkText("Prev")).click();
		List<WebElement> eles=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody//td"));
		for(WebElement ele:eles)
		{
			String date=ele.getText();
			if(date.equalsIgnoreCase("23"))
			{
				ele.click();
				break;
			}
			else
			{
			
				System.out.println("element not found");
				
				
			}
		}
		
	

		}	
}



	
	


