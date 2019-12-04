package Ju;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class K {

	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Before class");
	}
	@AfterClass
	public static void quitBrowser() {
		System.out.println("afterclass");
	}
	@Before
	public  void starttime() {
		System.out.println("Before");
	}
	@After
	public  void Endtime() {
		System.out.println("After");
	}
	@Test
	public  void testcase3() {
		System.out.println("Testcase3");
		Assert.assertTrue(false);
	}
	@Test
	public void testcase4() {
		System.out.println("Testcase4");
		Assert.assertTrue(true);
		
	}
	@Ignore
	@Test
	public void testcase5() {
		System.out.println("testcase5");
		Assert.assertTrue(true);
	}
	
	}


