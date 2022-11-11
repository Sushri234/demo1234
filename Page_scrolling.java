package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");//scroll down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)", "");//scroll up

		//WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[execut1]/img"));
		//js.executeScript("arguments[0].scrollIntoView();",flag);//scroll to view
	
		//js.executeScript("window.scroolTo(0,document.body.scrollHeight)");//scroll at the end
		
		
		

	

	}

}
