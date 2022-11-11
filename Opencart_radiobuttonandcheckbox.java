package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opencart_radiobuttonandcheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://demo.opencart.com");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("shiney");
		driver.findElement(By.name("lastname")).sendKeys("sree");
		driver.findElement(By.id("input-email")).sendKeys("salini@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("popopo");
		WebElement radio= driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]"));
		radio.click();
		System.out.println(radio.isSelected());
		Thread.sleep(3000);
		WebElement chkbox=driver.findElement(By.name("agree"));
		for (int i=0;i<2;i++)
		System.out.println(chkbox.isSelected());
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}

}
