package makemytrip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CTBSPlus {
/*	Properties prop=new Properties();
	FileInputStream fis;*/
	
	
	
	WebDriver driver;
	CTBSprop cp= new CTBSprop();

	@Test
	public void loginpage() throws InterruptedException, IOException {
		/* try {
				fis = new FileInputStream("C:\\Users\\c22642\\eclipse-workspace\\TestMaven\\src\\test\\java\\makemytrip\\CTBSplus.properties");
				prop.load(fis);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		 String username = prop.getProperty("user_name");
		    String password = prop.getProperty("password");*/
		
		String str=driver.getTitle();
	    System.out.println("home page title is"+str);
		/*if(str.equalsIgnoreCase("Log in")) {
		driver.findElement(By.id("username")).sendKeys("c22642");
		driver.findElement(By.id("password")).sendKeys("welcome@123");
		
		WebElement ele1=driver.findElement(By.name("Login"));
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("arguments[0].click();",ele1 );
        Thread.sleep(2000);
		}
		else if(str.equalsIgnoreCase("Log in")) {
			driver.findElement(By.linkText("Manual logout")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Click here to Login")).click();
			driver.findElement(By.name("Login")).click();
		}*/
		
	if(str.equalsIgnoreCase("Log in")) {
			driver.findElement(By.linkText("Manual logout")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("useName")).sendKeys("");
			driver.findElement(By.id("password")).sendKeys("");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Click here to Login")).click();
			driver.findElement(By.name("Login")).click();
			
			}
	
	}
	
	
	
	
	  @BeforeTest
	  public void StartBrowser_NavURL() {
		  System.setProperty("webdriver.chrome.driver", "D:\\lib for selenium\\drivers\\New folder\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	    /*  try {
				fis = new FileInputStream("C:\\Users\\c22642\\eclipse-workspace\\TestMaven\\src\\test\\java\\makemytrip\\CTBSplus.properties");
				prop.load(fis);
				
			} catch (Exception e) {
				e.printStackTrace();
			}*/
	     
	      //String url = prop.getProperty("url");
	      driver.get("");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	  }

}
