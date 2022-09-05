package day5_SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main (String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		
		
		
		driver.getTitle();
		System.out.println("Page Title Is" +driver.getTitle());
		System.out.println("Length of page Title is" +driver.getTitle().length());
		
		
		driver.getCurrentUrl();
		System.out.println("Current Url is " +driver.getCurrentUrl());
		
		driver.getPageSource();
		System.out.println("Lenght of pageSource is " +driver.getPageSource().length());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		
		Thread.sleep(2000);
		String currenttitle2 = driver.getTitle();
		String ExpectedTitle2 = "actiTIME -Enter Time-Track";
		
		
		System.out.println("current title2 is " +currenttitle2);
		System.out.println("Expected Title is " +ExpectedTitle2);
		System.out.println("validation of title is " +currenttitle2.equals(ExpectedTitle2));
		
		
		String currenturl2 =driver.getCurrentUrl();
		
		System.out.println("current Url is" +currenturl2);
		
		WebElement LogOut = driver.findElement(By.id("logoutLink"));
		
		LogOut.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

