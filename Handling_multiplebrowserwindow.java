package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiplebrowserwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo ");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"text-gray-800 text-size-14 font-normal block w-full\"]")).click();
		//Thread.sleep(3000);
		Set<String>windowshandles=driver.getWindowHandles();
		System.out.println(windowshandles);
		
		Iterator<String>iterator=windowshandles.iterator();
		String parentwindow=iterator.next();
		System.out.println(parentwindow);
		String childwindow=iterator.next();
		System.out.print(childwindow);
		
		driver.switchTo().window(childwindow);
		
		//driver.findElement(By.id("exit_popup_close")).click();
		
	

	}

}
