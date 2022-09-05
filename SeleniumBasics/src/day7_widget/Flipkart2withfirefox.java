package day7_widget;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Flipkart2withfirefox {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String ExePath = CurrentDir + "\\Executables\\geckodriver.exe";
		                                
		System.setProperty("webdriver.gecko.driver", ExePath);
		
        FirefoxDriver driver = new FirefoxDriver();
 
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
	    
	    
 List<WebElement> series = driver.findElements(By.cssSelector("div._37M3Pb>div.eFQ30H>a"));
	    
	    System.out.println(" offer series Number is " + series.size());
	    
	    for(int i=0; i<series.size(); i++)
	    {
	    	WebElement element = series.get(i);
	    	
	    	//System.out.println("Offers series are " + i + " :" + element.getText());
	    	
	    }
	    
	}

}
