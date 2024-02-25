package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void Befocls()
	{
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void weblogincarLoan(String uRlname,String Key)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(uRlname);
		System.out.println(Key);
	}
	
	
	@BeforeMethod
	public void beofreevry()
	{
		System.out.println("I will execute before every test method in day  class");
	}
	
	@AfterMethod
	public void afofreevry()
	{
		System.out.println("I will execute after every test method in day  class");
	}
	
	@AfterClass
	public void afcls()
	{
		System.out.println("After executing all the methods in the class");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLogincarloan()
	{
		//appium
		System.out.println("mobilelogincar");
	}
	
	@BeforeSuite
	public void BfeSuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void mobilesignInloan()
	{
		System.out.println("Mobile Login SIGN IN");
	}
	
	@Test(dataProvider="getData")
	public void mobilesignoutLoan(String username, String password)
	{
		System.out.println("Mobile login SIGN OUT");
		System.out.println(username); 
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"weblogincarLoan","mobilesignoutLoan"})
	public void APIcarloan()
	{
		//Rest API automation
		System.out.println("loginapicarloan");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1 combo- username, password - good credit history
		//2nd - username, password- no credit history
		//3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row is nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
		
	}

}
