package testNG;

import org.testng.annotations.Test;

public class SuiteExample {

	

	@Test
	public void startTheCar() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Giridharan\\eclipse-workspace\\TestNGSwetha\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
    
       driver.get("https://www.facebook.com/");

}
}
	  
	

	            
	           

	

