package day6_browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe" );
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(450, 600));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement fpw = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		
		fpw.click();
		
		System.out.println("Forgot your password utl : " + driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("Login Url " + driver.getCurrentUrl());
		
		
		driver.navigate().forward();
		
		System.out.println("Forgot your password utl " +driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		System.out.println("hello");
		driver.navigate().to("https://www.google.com");
		
		
		
		
		
	}

}
