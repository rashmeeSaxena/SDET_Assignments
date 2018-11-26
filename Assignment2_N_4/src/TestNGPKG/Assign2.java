package TestNGPKG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ReportingListener.class)
public class Assign2 {
	
	public WebDriver driver;

	
	@org.testng.annotations.BeforeSuite
	public void LaunchBrowser ()
	{
				
	

		System.out.println("reminder:" +6%4);
			 
		//System.setProperty("webDriver.gecko.driver", "Jars\\geckodriver.exe");

		//driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "Jars\\chromedriver.exe");
		//System.out.println("reminder:" +6%4);

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
			
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
		System.out.println("**Inside Before Suite**");
	
		
	}
	
	
	@org.testng.annotations.BeforeTest
	public void GetURL()
	{
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		System.out.println("**Get URL Before Test**");
		
		
	}
	
	@Test(priority=1)
	public void LoginApplication()
	{
		System.out.println("**Try to Login now AfterSuite**");
 
		WebDriverWait  wait = new WebDriverWait  (driver,500);

		
		driver.findElement(By.id("user_login")).sendKeys("Admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		
		driver.findElement(By.id("wp-submit")).click();
		
		 System.out.println("**Login AfterSuite**");
		 
	}
	
	
	
	

}
