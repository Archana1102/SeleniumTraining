package day7_widget;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {

	public static void main(String[] args) {

		String CurrentDir = System.getProperty("user.dir");
		String ExePath = CurrentDir + "\\Executables\\chromedriver.exe";
		                                
		System.setProperty("webdriver.chrome.driver", ExePath);
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
	    driver.get("https://www.cricinfo.com/");
	    
	    
	    String PageTitle = driver.getTitle();
	    String ExpectedTitle= "CricInfo";
	    
	    System.out.println("Home Page Title is :" +PageTitle);
	    System.out.println("Expected Title is : " +ExpectedTitle);
	    System.out.println("Validation of Title is: " +PageTitle.equals(ExpectedTitle));
	    
	    String PageUrl = driver.getCurrentUrl();
	    String ExpectedUrl = "https://www.cricinfo.com";
	    
	    System.out.println("Page url is: " + PageUrl);
	    
	    System.out.println("Expected Url is " + ExpectedUrl);
	    
	    System.out.println("Validation of url is " +PageUrl.equals(ExpectedUrl));
	    
	    
	    
	    
	    List<WebElement>  optionname = driver.findElements(By.cssSelector("div.ds-flex .ds-flex-row>div>a"));
	    
	    System.out.println("Option Name count : " +optionname.size());
	    
	    for(int i=0; i<optionname.size(); i++) {
	    	
			WebElement elements = optionname.get(i);
	    	//String TextName= elements.getText();
	    	//System.out.println("Menu name is :" +TextName);	    	

	    	System.out.println("Menu name is :" +elements.getText());	    	
	    }
	     
	    driver.close();
	    
	    
	    
	}

}
