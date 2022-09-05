package day4_SeleniumValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm2 {

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Length of page is " +driver.getTitle());
		
		System.out.println("Title of page is " +driver.getTitle().length());
		
		System.out.println("current url is " +driver.getCurrentUrl());
		
		System.out.println("Lenghth of page source is " +driver.getPageSource().length());
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				
		 driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.getTitle();
		
		System.out.println("current Title is " + driver.getTitle());
		System.out.println("cyrrent title length is " +driver.getTitle().length());
		
		
		System.out.println("Current url is " + driver.getCurrentUrl());
		
		
		
		
		// logout is pending 
		
		
		
		

	
	}

}
