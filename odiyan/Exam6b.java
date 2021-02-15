package odiyan;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Exam6b {
	
	protected WebDriver driver;
	@Test
	public void amazon() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\training\\Desktop" );
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "Amazon";
	String aTitle = "" ;
	
	driver.get("https://www.amazon.in" );
	
	driver.manage().window().maximize() ;

	aTitle = driver.getTitle();
	
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser
	driver.close();
}
}