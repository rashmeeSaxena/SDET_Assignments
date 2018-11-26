package POMPKG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(ReportingListener.class)
public class LoginPomClass {
	
WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser()

	
	{
		
		System.out.println("Test");
		
		System.setProperty("webdriver.gecko.driver", "Jars\\geckodriver.exe");
	
		driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
	}

	@Test(priority=1)
	public void verifyValidLogin()
	{
		LoginPage Login=new LoginPage(driver);
		Login.typeUserName("Admin");
		Login.typePassword("demo123");
		Login.CLickonLoginButton();
		
		
	}
	
	@Test(priority=2)
	public void verifyAllUser()
	{
		LoginPage Login=new LoginPage(driver);
		Login.SearchAllUsers("Admin");
		Login.SearchAllUsers("test");
		
	}
	
	@Test(priority=3)
	public void verifyADDUser()
	{
		LoginPage Login=new LoginPage(driver);
		Login.typeUserName("Admin");
		Login.typePassword("demo123");
		Login.CLickonLoginButton();
		Login.GOtoAllUsers();
		
	}
	
	@Test(priority=4)
	public void verifyMyProfile()
	{
		LoginPage Login=new LoginPage(driver);
		Login.typeUserName("Admin");
		Login.typePassword("demo123");
		Login.CLickonLoginButton();
		Login.GOtoAllUsers();
		
	}
	
	/*@AfterTest
	public void verifyALLUsers()
	{
		LoginPage Login=new LoginPage(driver);
		Login.clickAllUsers();
		//Login.typePassword("demo123");
		//Login.CLickonLoginButton();
		
		
	}*/
	
	

}


