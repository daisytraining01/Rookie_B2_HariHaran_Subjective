package odiyan;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exam4 {
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop");
	  
	  wd= new ChromeDriver();
        wd.get("https://cosmocode.io/automation-practice-webtable/\r\n"
        		+ "Belarus");         
        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        
        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
       
    }
}


