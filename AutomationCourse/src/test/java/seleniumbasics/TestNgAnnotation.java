package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {

	@Test
	public void sampleTest() {
		System.out.println("Sample Test");
	}
	
	@Test
	public void sampleTest2() {
		System.out.println("Sample Test2");
	}
	@BeforeMethod  // before every @Test that is run
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod  // after every @Test that is run
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
	@BeforeClass // before class that is run
	public void beforeClass() {
		System.out.println("Before Class");

	}
	
	@AfterClass // after class that is run
	public void afterClass() {
		System.out.println("After Class");

	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("2nd of all -Before test is executed before class");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("2nd of all- After test is executed after class");

	}
	
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("first of all- before suite");

	}
	
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("last of all- After suite");

	}
}
