package test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintingTheLinksTwoSEPT 
{
	@Test
	public void printingLinks() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.tagName("span"));
		
		System.out.println(list.size());
		
		Thread.sleep(2000);
		
		//1st approach
		
		/*for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}*/
		
		for(WebElement k:list)
		{
			System.out.println(k.getText());
		}
		
		driver.close();
	}

}
