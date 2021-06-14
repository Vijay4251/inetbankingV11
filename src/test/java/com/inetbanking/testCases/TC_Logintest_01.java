package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Loginpage;

public class TC_Logintest_01 extends BaseClass {
	@Test
	public void loginTest() throws IOException 
	{
			
		Loginpage lp=new Loginpage(driver);
		
		lp.setUserName(username);
		//logger.info("Entered username");		
		
		lp.setPassword(password);
		//logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passes");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

}
