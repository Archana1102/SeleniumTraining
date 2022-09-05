package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowsers {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\geckodriver.exe");
		
		FirefoxDriver fdriver = new FirefoxDriver();
		
         fdriver.get("https://www.google.com");
         fdriver.close();
	}

}
