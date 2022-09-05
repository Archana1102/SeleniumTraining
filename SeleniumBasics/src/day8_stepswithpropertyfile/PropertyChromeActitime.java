package day8_stepswithpropertyfile;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyChromeActitime {

	public static void main(String[] args) throws IOException {

		FileInputStream fis= new FileInputStream(".\\propertyfile\\TestData.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String ExecutablePath = prop.getProperty("driverExecutablePath");
        String driverKey = prop.getProperty("driverKey");
		String appUrl   = prop.getProperty("appUrl");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String ExpectedloginPageTitle = prop.getProperty("loginPageTitle");
	    String buttonName = prop.getProperty("buttonName");
		
		System.out.println(ExecutablePath +"\n" + driverKey + "\n" +appUrl +"\n" + username + "\n" + password + "\n" + ExpectedloginPageTitle + "\n" + buttonName );
		
		
		String currentdir= System.getProperty("user.dir");
		//String ExePath= currentdir + "\\Executables\\chromedriver.exe";
		
		String ExePath= currentdir + ExecutablePath; // by uing property file
		
		//String ExePath= System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		
		
		//System.setProperty("webdriver.chrome.driver" , Exepath);
		
		System.setProperty(driverKey, ExePath);  // (1)
		
		ChromeDriver driver= new ChromeDriver();  // 
		
		// driver.get("https://demo.actitime.com");
		
		driver.get(appUrl);   // by using propery file
		
		/* ******* STEPS TO GET TITLE ********
		String currentTitle= driver.getTitle();
		String ExpectedTitle= "actiTIME-login";
		
		System.out.println("Current Title of page is: " +currentTitle);
		System.out.println("Expected title Of page is " +ExpectedTitle);
		System.out.println("Length of title page is: " +currentTitle.lenghth());
		System.out.println("validation of title is: "+ currentTitle.equals(ExpectedTitle));
		*/
		String currentTitle= driver.getTitle();

		
		System.out.println(" Expected Title of page is " + ExpectedloginPageTitle);
		System.out.println("validation of title is: "+ currentTitle.equals(ExpectedloginPageTitle));

		
		/* *******  STEPS TO GET URL *******
		String currentUrl= driver.getCurrentUrl();
		String ExpectedUrl= "https://demo.actitime.com";
		
		
		System.out.println("current Url is " +currentUrl);
		System.out.println("Expected Url is " +ExpectedUrl);
		System.out.println("validation of Url is" +currentUrl.equals(ExpectedUrl));
		
		 */
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		System.out.println("Url validation status: "+pageUrl.contains(appUrl)); // bby using property
		
		/* *********** STEPS TO GET PAGESOURCE ********
		String PageSource= driver.getPageSource();
		
		System.out.println("Page source is " +PageSource);
		System.out.println("LenGth of page is " +PageSource.length());
		*/
		
		
		/* ********* STEPS TO SET USERNAME**********
		 WebElement username2 = driver.findElement(By.id("username")); // way1
		 
		username2clear(); 
		username2.sendKeys(username);   // or type2 set password using property file
		Username2.sendKeys("admin");  // normal method
		
		driver.findElement(By.id("username")).sendKeys(username); // way2 -- by using property
		driver.findElement(By.id("username")).sendKeys("admin");
		*/
		 
		driver.findElement(By.id("username")).sendKeys(username);  // by using propertyfile
		
		/* 
		  ********* STEPS TO SET password**********
		 	WebElement password2 = driver.findElement(By.id("pwd"));
		password2.clear();
		password2.sendKeys(password); // or type2 set password using property file
		password2.sendKeys("manager");     
		
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys(password);  // by using property
		 
		 */
	
		driver.findElement(By.name("pwd")).sendKeys(password);

		/* STEPS TO SET LOGIN BUTTON 
		  
		  	
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		loginButton.click();
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("loginButton")).
		
		 */
		
		
		driver.findElement(By.id("loginButton")).click();
		
		
		//driver.close();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
