package day4_SeleniumValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) 
	{
// Generic Method
		String chromeExepath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		
		// direct path 
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe");

		
		ChromeDriver cdriver= new ChromeDriver();
		
		cdriver.get("https://demo.actitime.com/login.do");
		
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String curenttitle = cdriver.getTitle();
		String ExpectedTitle= "actiTIME";
		
		
		System.out.println("current title is: " +curenttitle);
		System.out.println("Expected title is " +ExpectedTitle);
		System.out.println("validation of title is " +curenttitle.equals("ExpectedTitle"));
		System.out.println("Length of title is " +curenttitle.length());
		
		String currentUrl = cdriver.getCurrentUrl();
		String ExpectedUrl = "https://demo.actitime.com/login.do";
		
		System.out.println("Current URL is" +currentUrl);
		System.out.println("Expected URL is" +ExpectedUrl);
		
		System.out.println("Validation of URL is" +currentUrl.equals(ExpectedUrl));
		
		
		String PageSource= cdriver.getPageSource();
		
		//System.out.println("Page source code id" +PageSource);
		System.out.println("Length of page Source is" +PageSource.length());
		
        /*
		WebElement username =cdriver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		*/
		
		
		 cdriver.findElement(By.id("username")).sendKeys("admin");
		
		
		/*
		WebElement password= cdriver.findElement(By.name("pwd"));
		
		password.clear();
		password.sendKeys("manager");
		
		*/
		
		cdriver.findElement(By.name("pwd")).sendKeys("manager");
		
		/*
		 
		 	WebElement SubmitBtn = cdriver.findElement(By.id("loginButton"));
		SubmitBtn.click();
		 */
		
		cdriver.findElement(By.id("loginButton")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
	}

	

}
