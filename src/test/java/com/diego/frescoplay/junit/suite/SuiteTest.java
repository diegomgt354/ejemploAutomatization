package com.diego.frescoplay.junit.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
test1.class,
test2.class,
})
public class SuiteTest {

	@BeforeClass
	public static void setUpClass(){
		
	}
	
	@AfterClass
	public static void setDownClass(){
		
	}
	
	@Test
	public void testMain(){
		
	}
}
