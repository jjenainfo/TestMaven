package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientTest {
	
	WebDriver driver;
	
	@Test
	public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver", "D:\\lib for selenium\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://student.mybmtc.com:8280/pass/anonymous/institution/registration/new");
		    Page p=new Page(driver);
		    p.select_list();
	}
	
	

}
