package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecifiedItem_InDropdownlist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0')]")).click();
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.id("month"));
		Select sel=new Select(element);
		List<WebElement> hlo=sel.getOptions();
		System.out.println(hlo.size());
		
		for(int i=0;i<hlo.size();i++)
		{
			if(hlo.get(i).getText().contains("May"))
			{
					System.out.println("value is present in dropdownlist");
			}
			else
			{
				System.out.println("value is not present");
			}
		}
		
	}
}
