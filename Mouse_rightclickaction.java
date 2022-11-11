package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_rightclickaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement act=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		
		Actions act1=new Actions(driver);
		act1.contextClick(act).perform();
		
		//act1.doubleClick(act).perform();
		
		//act1.clickAndHold(act).perform();
	}

}
