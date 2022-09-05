package day6_browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		System.out.println("Current vtigar is: " +driver.getCurrentUrl());
		
		Thread.sleep(2000);

		driver.findElement(By.className("forgotPasswordLink")).click();
        System.out.println("Current home Page is " +driver.getCurrentUrl());

		
	
		
		//driver.manage().window().setSize(new Dimension (400,600));
	
         System.out.println("Current Url of forgot pasword page is " +driver.getCurrentUrl());
  
      // driver.manage().window().maximize();
  
          driver.navigate().back();
  
         System.out.println("Current home Page is " +driver.getCurrentUrl());
   
              driver.navigate().forward();
              
             
              
              
  
            driver.navigate().refresh();
  
       driver.navigate().to("https://www.google.com");
  
  
		
		
		
		
	}

}
