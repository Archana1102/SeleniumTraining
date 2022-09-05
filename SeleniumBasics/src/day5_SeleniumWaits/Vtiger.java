package day5_SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		
		String CurrentDir= System.getProperty("user.dir");
		String ExePath = CurrentDir + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ExePath);

    ChromeDriver driver= new ChromeDriver();
    
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement InputUserNameField = driver.findElement(By.id("username"));
		
		System.out.println("InputUserNameField is Displayed or not " +InputUserNameField.isDisplayed());
		System.out.println("InpitUserNameField is Functional or not " +InputUserNameField.isEnabled());
		
		String DefaultInputUsernameField = InputUserNameField.getAttribute("placeholder");
		
		System.out.println("DefaultInputUserNameField is " +DefaultInputUsernameField);
		
		System.out.println("Validatiaon of DefaultInputUserNameField " +DefaultInputUsernameField.equals("Username"));
		
		WebElement InputPasswordfield= driver.findElement(By.id("password"));
		
		System.out.println("InputpasswordField is Displayed or not " +InputPasswordfield.isDisplayed());
		System.out.println("IputPasswordField Is Functinal or not " +InputPasswordfield.isEnabled());
		
		
		String DefaultInputPasswordfield = InputPasswordfield.getAttribute("placeholder");
		
		System.out.println("DefaultInputpassword is " +DefaultInputPasswordfield);
		System.out.println("validation of DefaultInputPassword is "  +DefaultInputPasswordfield.equals("Password"));
		
		
		
		
		WebElement InputLoginButton = driver.findElement(By.className("button"));
		
		System.out.println("Login Button is Displayed or not " +InputLoginButton.isDisplayed());
		System.out.println("login Button is Functional or not " +InputLoginButton.isEnabled());
		
		String defaultloginbuttonname = InputLoginButton.getText();
		
		System.out.println("login Button name is " +defaultloginbuttonname);
		InputUserNameField.sendKeys("admin");
		InputPasswordfield.sendKeys("Test@123");
		
		
		InputLoginButton.click();
		
			
		
	}

}
