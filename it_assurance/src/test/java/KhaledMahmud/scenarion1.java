package KhaledMahmud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scenarion1 {
	WebDriver driver;
	
	@BeforeTest
	public void base()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.assurancewireless.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	@Test
	public void my_Test()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	@AfterTest
	public void exit()
	{
		driver.quit();
	}
}
