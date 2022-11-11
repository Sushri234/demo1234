package Automation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandles{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div[6]/div[1]/div[2]/div[2]/div/div[1]/div/a")).click();
		  
		System.out.println(driver.getWindowHandle());
		Set<String> windowshandles=driver.getWindowHandles();
		System.out.println(windowshandles.size());
		System.out.println(driver.getWindowHandles());
		ArrayList<String>al=new ArrayList<>(windowshandles);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			driver.switchTo().window(al.get(i));
			String title=driver.getTitle();
			if(title.contains("time tracking"))
					{
				driver.switchTo().window(al.get(i));
				System.out.println(title);
				System.out.println(al.get(i));
			
					}
		}
		
		

	}
}



