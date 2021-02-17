package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page {
	static WebDriver driver;
	public Page(WebDriver driver)
	{
	    //initialize elements
	      PageFactory.initElements(driver,this);

	}

	
	@FindBy (id="institutionType")
	static WebElement name;
	
	
	public static void select_list()
	{
	     Select stat=new Select(name);
	     stat.selectByVisibleText("CBSE");
	}

	
	

}
