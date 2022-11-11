package Automation;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.build.Plugin.Engine.Source.Element;

public class Dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0')]")).click();
		Thread.sleep(3000);
		WebElement list=driver.findElement(By.id("month"));
		Select pee=new Select(list);
		//pee.selectByVisibleText("Aug");
		pee.selectByValue("3");
		List<WebElement> opt=pee.getOptions();
		List originalist=new ArrayList();
		
		for(WebElement e:opt)
		{
			originalist.add(e.getText());
			
		}
		System.out.println(originalist);
		
		
		
	}

}
