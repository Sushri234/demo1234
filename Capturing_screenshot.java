package Automation;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File trg=new File("C:\\Users\\DELL\\Pictures\\screenshot1.png");
		 FileUtils.copyFile(src,trg);
		
		
		
		
		

	}

}
