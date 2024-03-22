package com.TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Hybrid.BaseClass;
import com.PomPageClasses.LoginPomClass;

public class LoginTestClass extends BaseClass  {
	BaseClass base = new BaseClass();
	
	@BeforeClass
	public void setUp()
	{
		base.launchWebDriver();
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	@Test
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM");
	}
	@Test
	public void loginTest()
	{
		LoginPomClass pomclass= new LoginPomClass();
		String username = pomclass.getUsername();
		
		String password = pomclass.getPassword();
		pomclass.setUsername(username);
		pomclass.setPassword(password);
		pomclass.login();
	}
	
	
}
//OrangeHRM