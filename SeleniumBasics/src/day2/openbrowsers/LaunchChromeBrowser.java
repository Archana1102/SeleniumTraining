package day2.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
 
		
		/*
		String CurrentPath = System.getProperty("user.dir");
		String exepath = CurrentPath +"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		*/
		
		// By Using generic
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRUANSH\\OneDrive\\Documents\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe" );
	
		ChromeDriver cdriver = new ChromeDriver();

		cdriver.get("https://www.google.com");
		
		cdriver.getTitle();
		
		System.out.println("Title page is  " + cdriver.getTitle());
		System.out.println("Length of page is "+ cdriver.getTitle().length());
		
		
		cdriver.getCurrentUrl();
		
		System.out.println("url of page is" +cdriver.getCurrentUrl());
		
		cdriver.getPageSource();
		
		System.out.println("Length of page source is" +cdriver.getPageSource().length());
		
		
		cdriver.close();
			
	}

}
