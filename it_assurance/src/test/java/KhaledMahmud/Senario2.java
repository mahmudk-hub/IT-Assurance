package KhaledMahmud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Senario2 {
	WebDriver driver;
	
	@BeforeTest
	public void base()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.assurancewireless.com/");
		driver.manage().window().fullscreen();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	
	}
	
	@Test
	public void my_Test()
	{
		WebElement link01 = driver.findElement(By.xpath("(//a[contains(text(),'My Account Login')])[1]"));
		System.out.println(link01.getText());
		System.out.println(link01.getTagName());
		System.out.println(link01.getAttribute("href"));
		 
		System.out.println("Color is : "+ link01.getCssValue("background-color"));
		System.out.println("Font is " + link01.getCssValue("font-size"));
		
		link01.click();
	}
	
	@AfterTest
	public void exit()
	{
		driver.quit();
	}

}
