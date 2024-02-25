package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("i will execute last");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");//automation
	}
	
	@AfterSuite
	public void afsuite()
	{
		System.out.println("I am the number one from last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}

}
