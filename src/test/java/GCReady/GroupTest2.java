package GCReady;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTest2 {
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
	public void DeAdVendor() {
			

System.out.println("Delete Vendor Successful");


	}
	@Test(priority=2)
	public void Deproduct() {
			

System.out.println("Delete product Successful");


	}
	
	@Test(priority=3)
	public void DeCurrency() {
			

System.out.println("Delete currency Successful");

	}
	

}//end class
