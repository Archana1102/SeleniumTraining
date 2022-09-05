package day7_widget;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena2 {

	public static void main(String[] args) {

		String CurrentDir = System.getProperty("user.dir");
		String ExePath = CurrentDir + "\\Executables\\chromedriver.exe";
		                                
		System.setProperty("webdriver.chrome.driver", ExePath);
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
	    driver.get("https://www.flipkart.com/");
	    
	    
	    
	    String PageTitle = driver.getTitle();
	    String ExpectedTitle= "FlipKart";
	    
	    System.out.println("Home Page Title is :" +PageTitle);
	    System.out.println("Expected Title is : " +ExpectedTitle);
	    System.out.println("Validation of Title is: " +PageTitle.equals(ExpectedTitle));
	    
	    String PageUrl = driver.getCurrentUrl();
	    String ExpectedUrl = "https://www.flipkart.com";
	    
	    System.out.println("Page url is: " + PageUrl);
	    
	    System.out.println("Expected Url is " + ExpectedUrl);
	    
	    System.out.println("Validation of url is " +PageUrl.equals(ExpectedUrl));
	
	}

}
