package day5_SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 {

	public static void main(String[] args)
	{
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		
		System.out.println("UserName is Displayed or not?" +userNameInputField.isDisplayed());
		System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
		
		
		String DefaultValueInUserInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default value validation for user name input field:" +DefaultValueInUserInputField);
		
		System.out.println("Default value validation for user name input field status: "+DefaultValueInUserInputField.equals("Username"));
		
		
		
		WebElement passwordInputField= driver.findElement(By.name("pwd"));
		
		System.out.println("Default value validation for password input field: " +passwordInputField.isDisplayed());
		System.out.println("Default value validation for password input field status: " +passwordInputField.isEnabled());
		
		
		String DefaulValueInPasswordInputField=passwordInputField.getAttribute("placeholder");
		
		System.out.println("Default value validation for password input field" +DefaulValueInPasswordInputField);
		System.out.println("Default value validation for password input field status" +DefaulValueInPasswordInputField.equals("password"));
		
		
		
		WebElement  loginInputField = driver.findElement(By.id("loginButton"));
		
		System.out.println("Default value validation for login input field " +loginInputField.isDisplayed());
		System.out.println("Default value validation for password input field status " +loginInputField.isEnabled());
		
		
		String DefaultValueInLoginField = loginInputField.getAttribute("placeholder");
		
		System.out.println("Default value validation for password input field" +DefaultValueInLoginField);
		System.out.println("Default value validation for password input field status" +DefaultValueInLoginField.equals("login"));
		
		
		
		

		WebElement keepLoggedInLabelCheckBoxText= driver.findElement(By.id("keepLoggedInLabel"));
		
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		System.out.println(keepLoggedInLabelCheckBoxText.isSelected());

		String checkBoxtextName= keepLoggedInLabelCheckBoxText.getText();
		System.out.println(checkBoxtextName);
		

		
		
		
		
		
		
		
		
	}


}
