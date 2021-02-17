package makemytrip;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MmtLogin {
	
	static WebDriver driver;

  @Test
  public static void selectDate() {
	  
	//click on date picker.
	  
	 WebElement calender= driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']"));
	  
		
			//Clicking on calendar to open calendar widget
			calender.click();
			
			// Retrieving current year value
			String currentYear= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
			
			System.out.println(currentYear);

			// Click on Next arrow till we get desired year
			if(!currentYear.equals("March 2020"))
			{
				do{
					driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				}
           while
        	   (!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().equals("March 2020"));
				
			}
  }
		//	System.out.println("success");
			
			// Select desired month after selecting desired year
			/*
			String currentMonth= driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText();
			if(!currentMonth.equalsIgnoreCase(monthName))
			{
				do{
					driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
				}while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText().trim().equalsIgnoreCase(monthName));
				
			}
			//get java month number for desired month
			
			int javaMonthInt= HandlingMMTCalendar.getMonthJavaInt(monthName);
			
			// Find dates of desired month only
*/			
/*			List<WebElement> allDateOfDesiredMonth= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table/tbody[1]//td[(@class=' ' or @class=' ui-datepicker-week-end ' ) and @data-month='"+javaMonthInt+"']"));
			for(WebElement d:allDateOfDesiredMonth )
			{
				if(d.getText().trim().equals(day))
				{
					d.click();
					break;
				}
			}
			
			
			
		}
		
		// Code to get java month number
		public static int getMonthJavaInt(String monthName) throws ParseException 
		{

			Date date = new SimpleDateFormat("MMMM").parse(monthName);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			return cal.get(Calendar.MONTH);
		}
		
		public static void main(String[] args) throws ParseException {
			
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			
			// Locating departure date calendar
			WebElement departCal= driver.findElement(By.id("hp-widget__depart"));
			HandlingMMTCalendar.selectDate(departCal, "2017", "September", "22", driver);
			
			
			
			
			

		}
	  */
	  
			
			   
	  
	  
  
 // } 
  
  @BeforeTest
  public void StartBrowser_NavURL() {
	  System.setProperty("webdriver.chrome.driver", "D:\\lib for selenium\\drivers\\New folder\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.makemytrip.com/");
  }
  
}
