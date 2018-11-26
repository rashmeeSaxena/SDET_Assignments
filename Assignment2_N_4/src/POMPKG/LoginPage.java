package POMPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;


public class LoginPage {
	
WebDriver driver;
	
	By username=By.id("user_login");

	//private String txtPassword;
	
	By password=By.id("user_pass");
	By loginbutton=By.id("wp-submit");
	
	By Users =By.id("menu-users");
	
	By Searchuser =By.id("user-search-input");
	
	By Submit =By.id("search-submit");
	
	By Dashboard=By.className("wp-menu-name");
	
	
	
	//constructor of the class 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void typeUserName(String uid)
	{
		
		driver.findElement(username).sendKeys(uid);
		
		
	}

	public void typePassword(String pass)
	{
		
		driver.findElement(password).sendKeys(pass);
		
		
	}
	
	
	public void CLickonLoginButton()
	{
		
		driver.findElement(loginbutton).click();
		
		
	}
	
	public void GOtoAllUsers()
	{
		//Wait for the application to load
		
		WebDriverWait  wait = new WebDriverWait  (driver,45);

		wait.until(ExpectedConditions.visibilityOfElementLocated(Users));

		driver.findElement(Users).click();
	}
	
	
	public void SearchAllUsers(String user)
	{
		
	
		
		driver.findElement(Searchuser).sendKeys(user);
	driver.findElement(Submit).click();
		//Validate assert or test displayed 
		
		
		
	}
	
	public void GotoDashboard()
	{
	//	driver.findElement(Dashboard).click();
		//driver.findElement(ALLUsers).click();
	}
	
	
}




