package day3_locators.openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		
		String currentDir= System.getProperty("user.dir");
		String ExePath=  currentDir +"\\Executables\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver", ExePath);
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		WebElement username= driver.findElement(By.id("txtUsername"));
		
		username.clear();
		username.sendKeys("Admin");
		
	//	WebElement pwd= driver.findElement(By.id("password"));

		WebElement pwd= driver.findElement(By.id("txtPassword"));
		pwd.clear();
		pwd.sendKeys("admin123");
		
		WebElement SubmitBtn = driver.findElement(By.id("btnLogin"));
		
		SubmitBtn.click();
		
	}

}
