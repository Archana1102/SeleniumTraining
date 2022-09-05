package day5_SeleniumWaits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {

		String currentDir= System.getProperty("user.dir");
		String ExePath = currentDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ExePath );
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement UserName = driver.findElement(By.name("username"));
		
		System.out.println("Username field is displayed or not?? " +UserName.isDisplayed());
		
		System.out.println("Username field is functional or not?? " +UserName.isEnabled());
		
		String defaultUserName= UserName.getAttribute("placeholder");
		
		System.out.println("default username is " +defaultUserName);
		System.out.println("validation of default username " +defaultUserName.equals("Username"));
		
		
		WebElement Password = driver.findElement(By.name("password"));
		
		System.out.println("Password field is displayed or not " +Password.isDisplayed());
		
		System.out.println("Password field is enabled or not " +Password.isEnabled());
		
		String defaultpassword = Password.getAttribute("placeholder");
		
		System.out.println("Default Password is : " +defaultpassword);
		System.out.println("Validation of default password is" +defaultpassword.equals("password"));
		
		WebElement LoginButton = driver.findElement(By.className("oxd button"));
		
		System.out.println("Login Button is Displayed or not " +LoginButton.isDisplayed());
		System.out.println("Login Button is Functional or not" +LoginButton.isEnabled());
		
		
		 
		
		
		
		
				

		
		
	}

}
