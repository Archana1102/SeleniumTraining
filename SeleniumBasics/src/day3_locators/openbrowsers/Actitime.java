package day3_locators.openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {

			
			String currentDir= System.getProperty("user.dir");
			String ExePath=  currentDir +"\\Executables\\chromedriver.exe";
			
			
			System.setProperty("webdriver.chrome.driver", ExePath);
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://demo.actitime.com/login.do");
			
			
			
		    WebElement username= driver.findElement(By.id("username"));
			
			username.clear();
			username.sendKeys("admin");
			

			WebElement pwd= driver.findElement(By.name("pwd"));
			pwd.clear();
			pwd.sendKeys("manager");
			
			WebElement SubmitBtn = driver.findElement(By.id("loginButton"));
			
			SubmitBtn.click();
			
	}

}
