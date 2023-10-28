package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class THIRTYONEAUG 
{
	
	@Test
	public void launchBrowser() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
