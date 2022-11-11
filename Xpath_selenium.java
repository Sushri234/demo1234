package Automation;



import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.findElement(By.id("input")).sendKeys("selenium");
		List<WebElement>suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggestions.size());
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		//Thread.sleep(3000);
		//List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		//System.out.println(suggestions.size());
	//driver.findElement(By.id("inputWrapper")).click();
		//Thread.sleep(3000);
	//starts-with
	//driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0')]")).click();
	
	List<WebElement>elements=driver.findElements(By.xpath("//*[starts-with(@id,'u_2_o_oR')]"));
	System.out.println("number of elements:"+elements.size());
	for (int i=0;i<elements.size();i++);{
	
		//System.out.println("Radio button text:" +Elements.get(i).getattribute("value"));
	driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("jfy");
	}

	}
}

	

	
		
		
		
							


