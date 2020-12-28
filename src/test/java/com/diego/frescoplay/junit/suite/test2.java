package com.diego.frescoplay.junit.suite;

import org.junit.Assert;
import org.junit.Test;

public class test2 {

	@Test
	public void testPrintMessage(){
		String hello = "Hello Word";
		System.out.println("suite test2 executing");
		Assert.assertNotNull(hello);
		Assert.assertEquals("Hello Word",hello);
	}
}
