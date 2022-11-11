package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div[1]/div[5]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-dark my-30 mx-10 hover:bg-lambda-900 hover:border-lambda-900\"]")).click();
		
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000);
		simpleAlert.accept();
		//Thread.sleep(2000);
		//driver.quit();
	

		

	}

}
