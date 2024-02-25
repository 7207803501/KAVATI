package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void webloginHomeloan(String uRlname) {
		System.out.println("webloginhomepersonalloan");
		System.out.println(uRlname);
		
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginhomeloan()
	{
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void loginAPIhomeloan()
	{
		System.out.println("APIloginhome");
	}
}
