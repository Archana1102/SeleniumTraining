package day6_browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		String currentDir = System.getProperty("user.dir");
		
		String ExePath = currentDir+ "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ExePath);
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(400, 600));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

          Thread.sleep(2000);		
		
WebElement fpw= driver.findElement(By.className("orangehrm-login-forgot-header"));
            fpw.click();
            
		
		System.out.println("Current url of password page is : " + driver.getCurrentUrl());
		
		
		Thread.sleep(2000);		

		driver.navigate().back();
		
		System.out.println("Home pgae is " +driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println("Password page is : " + driver.getCurrentUrl());
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.google.com");


		
		
	}

		
	}


