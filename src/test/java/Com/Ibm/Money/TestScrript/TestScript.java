package Com.Ibm.Money.TestScrript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript 
{
	WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.fb.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void VerifyTitle()
	{
		String s=driver.getTitle();
		System.out.println(s);
	}
	
	@Test
	public void VerifyUrl()
	{
		String st=driver.getCurrentUrl();
		System.out.println(st);
	}
	@Test
	public void verifyEmail()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("balaji");
	}
	
	@Test
	public void VerifyPassword()
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Selenium");
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}

}
