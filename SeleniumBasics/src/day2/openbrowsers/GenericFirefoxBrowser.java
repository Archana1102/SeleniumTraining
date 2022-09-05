package day2.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFirefoxBrowser {

	public static void main(String[] args) 
	{

		String currentdir = System.getProperty("user.dir");
		
		String exepath= currentdir + "\\Executables\\geckodriver.exe";
		
		
		System.setProperty("webdriver.gecko.driver", exepath);
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		
		String actualtitle= driver.getTitle();
		
		String expectedtitle= "facebook";
		System.out.println("Title is " + actualtitle);
		System.out.println("title lenght is" + actualtitle.length());
		
		System.out.println("validation of title is " + actualtitle.equals(expectedtitle));
		
		driver.close();
		
		
		
		
		
	}

}
