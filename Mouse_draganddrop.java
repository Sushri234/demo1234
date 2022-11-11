package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag=(driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]")));
		WebElement drop=(driver.findElement(By.xpath("(//li[@class='placeholder'])[4]")));
	
		Actions pet=new Actions(driver);
		pet.dragAndDrop(drag, drop).perform();
		
		//WebElement drag2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		//WebElement drop2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		//Actions bef=new Actions(driver);
		//bef.dragAndDrop(drag2, drop2).perform();
	}
}
	


