package day1.openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {

	public static void main(String[] args) throws InterruptedException {

		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
		
		   ChromeDriver driver= new ChromeDriver();
		   
		  // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().window().setSize(new Dimension(400, 600));
		   
		   driver.manage().window().maximize();
		   
		   
		   
		   
		   driver.get("https://demo.actitime.com/");
		   
		   
		   
		   
		   System.out.println("Title Page is: " +driver.getTitle());
		   System.out.println("Url is: " +driver.getCurrentUrl());
		   
		   String pageSource = driver.getPageSource();
		   
		   System.out.println("PageSource length  is : " +pageSource.length());
		   
		   
		 // WebElement username= driver.findElement(By.id("UserName"));
		 // username.sendKeys("admin");
		  
		   
		   Thread.sleep(2000);
		   
			 driver.findElement(By.id("username")).sendKeys("admin");

			driver.findElement(By.name("pwd")).sendKeys("manager");

		   
			driver.findElement(By.id("loginButton")).click();
			
			
			 System.out.println("Title Page of second page is: " +driver.getTitle());
			   System.out.println("Url page of second is: " +driver.getCurrentUrl());
			
			driver.navigate().back();
			
			 System.out.println("Title Page of second page is: " +driver.getTitle());

			driver.navigate().forward();
			
			 System.out.println("Title Page actitme of second page is: " +driver.getTitle());

			
			
			driver.findElement(By.id("logoutLink")).click();
			
			 System.out.println("Title Page of second page is: " +driver.getTitle());
driver.navigate().refresh();


driver.navigate().to("https://www.google.com");

driver.close();


			
			
			
			
			
			
			

		   
		
		
		
		
	}


	}


