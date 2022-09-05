package day2.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericChromeBrowser {

	public static void main(String[] args) {

		
		String currentDir= System.getProperty("user.dir");
		String exepath=  currentDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exepath);
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		String actualtitle= driver.getTitle();
		String ExpectedTitle= "demo.actitime";
		
		System.out.println("Actaul Title of page is " + actualtitle);
		System.out.println("Excepted Title of page is " + ExpectedTitle);
		System.out.println("Valiadation  Title of page is " + actualtitle.equals(ExpectedTitle));
		
		System.out.println("Length of title is" + actualtitle.length());
	
		
		
		String actualurl= driver.getCurrentUrl();
		String ExpectedUrl= "https://demo.actitime.com";
System.out.println("Actual Url is" + actualurl);
System.out.println("Expected url is" + ExpectedUrl);
System.out.println("validatioan of url is "  + actualurl.equals(ExpectedUrl));
System.out.println("valaidation of url using contains " +actualurl.contains(ExpectedUrl));

  String sourcelength= driver.getPageSource();
  
  System.out.println("page source" +sourcelength);
  
  System.out.println("Lenght of source is " + sourcelength.length());
  driver.close();
		
		
		
		
		
	}

}
