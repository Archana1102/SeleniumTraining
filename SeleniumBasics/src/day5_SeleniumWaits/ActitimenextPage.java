package day5_SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimenextPage {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		
		
	//	driver.manage().window().maximize();
		
		  
		   Thread.sleep(2000);
		   
			 driver.findElement(By.id("username")).sendKeys("admin");

			driver.findElement(By.name("pwd")).sendKeys("manager");

		   
			driver.findElement(By.id("loginButton")).click();
			
			
			System.out.println("title of Page is: " +driver.getTitle());
			
			System.out.println("Url of page is : " +driver.getCurrentUrl());
			
			
	WebElement NewKey = driver.findElement(By.cssSelector(".dashedLink"));
	
		NewKey.click();
		
		System.out.println("Hello world");
			
			//driver.close();
			
		
	}

}
