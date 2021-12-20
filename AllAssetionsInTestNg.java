package com.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllAssetionsInTestNg {

	@Test
	public void test()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		
	}
	@Test 
	public void test1()
	{
		Assert.assertTrue(false);
	}
	
	
	
	@Test 
	public void test2()
	{
		Assert.assertEquals("Test", "Test1");
	}
	
	
	@Test 
	public void test3()
	{
		Assert.assertEquals("Test", "Test2");
	}
	
	@Test 
	public void test4()
	{
		Assert.assertNotSame("false","not matching expected condition");
	}
	
	
	@Test 
	public void test5()
	{
		
		Assert.assertFalse(false,"not matching expected condition");
	}
	
	
	
}
