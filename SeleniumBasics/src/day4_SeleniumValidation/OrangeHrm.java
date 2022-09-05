package day4_SeleniumValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
String chromeExepath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		
		ChromeDriver cdriver= new ChromeDriver();
		

		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		cdriver.get("https://opensource-demo.orangehrmlive.com/");
		
		//String curenttitle = cdriver.getTitle();
		
		//System.out.println("current title is: " +curenttitle);
		
        /*
		WebElement username =cdriver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys("admin");
		*/
		
		cdriver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		/*
		WebElement password= cdriver.findElement(By.id("txtPassword"));
		
		password.clear();
		password.sendKeys("admin123");
		
		*/
		
		cdriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		/*
		WebElement SubmitBtn = cdriver.findElement(By.id("btnLogin"));
		SubmitBtn.clear();
		SubmitBtn.click();		
		*/
		
				
		cdriver.findElement(By.id("btnLogin")).click();
		 
		
		// Verify Home Page
		
		String HomePageTitle = cdriver.getTitle();
		String ExpectedHomepageTitle = "Orange Hrm";
		
		System.out.println("HomePage title is"+ HomePageTitle);
		System.out.println("Expected Home Page title is" +ExpectedHomepageTitle );
		System.out.println("validation of home title is " +HomePageTitle.equals(ExpectedHomepageTitle));
		
		
		String HomepageUrl = cdriver.getTitle();
		String ExpectedUrl = "dashboard";
		
		System.out.println("HomePage URL is" +HomepageUrl);
		System.out.println("Expectedtitle is" +ExpectedUrl);
		System.out.println("Validation of url is" + HomepageUrl.equals(ExpectedUrl));
		
		
		/*
		WebElement welcome = cdriver.findElement(By.id("welcome"));
		welcome.click();
		*/
		
		cdriver.findElement(By.id("welcome")).click();
		
		WebElement Logout1 = cdriver.findElement(By.linkText("Logout"));
		
		//System.out.println("Hello world");
		
	    Logout1.click();
		
	   //  cdriver.findElement(By.linkText("Logout")).click();
	
		cdriver.close();
			
				
		
	}



	}


