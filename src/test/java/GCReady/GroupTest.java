package GCReady;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTest {
	
	
	@BeforeTest
	public void login() {
	
System.out.println("Login Successful");


	}
	
	@AfterTest
	public void logout() {

System.out.println("LogOut Successfull");
System.out.println("---------------------------");

	}
	
	
	@Test(priority=1)
	public void AdVendor() {
			

System.out.println("Add Vendor Successful");


	}
	@Test(priority=2)
	public void Adproduct() {
			

System.out.println("Add product Successful");


	}
	
	@Test(priority=3)
	public void AdCurrency() {
			

System.out.println("Add currency Successful");

	}
	
	}//end class
