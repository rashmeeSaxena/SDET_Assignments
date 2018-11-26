package Packlevel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassA {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	@Test
	public void launchBrowser()
	{
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", "jars\\chromedriver.exe");
		//System.out.println("reminder:" +6%4);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		//login Test
		//driver.findElement(by)

		String str;

		str= driver.getCurrentUrl();
		System.out.println( "Value = "+ str);
		
		java.util.List<WebElement> MyLinks=driver.findElements(By.tagName("a"));
		
System.out.println("MyLinkSize---> "+MyLinks.size());

//loop1
for(WebElement el:MyLinks)
{
	System.out.println("Another way" +el.getText());

}
	
//loop2
for(int i=0;i<MyLinks.size();i++)
{
	WebElement ele=MyLinks.get(i);
	String url=ele.getAttribute("href");
	System.out.println("MyLinkSize---> "+MyLinks.get(i).getText());

}


	}

}
