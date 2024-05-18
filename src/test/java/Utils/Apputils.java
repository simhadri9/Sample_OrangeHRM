package Utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils 
{

	@BeforeTest
	public void GmailLogin()
	{
		System.out.println("Gmail login");
		
	}
	
	@AfterTest
	public void Gmaillogout()
	{
		System.out.println("Gmail logout");
		
	}
	
	@BeforeSuite
	public static void LunchApp()
	{
		System.out.println("Lunch app");
	}
	
	@AfterSuite
	public static void CloseApp()
	{
		System.out.println("closeApp");
	}
	
	
}
