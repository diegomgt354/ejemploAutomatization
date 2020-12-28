package com.diego.frescoplay.junit.suite;

import org.junit.Assert;
import org.junit.Test;

public class test1 {

	@Test
	public void testPrintMessage(){
		int num=5;
		System.out.println("suite test1 executing");
		Assert.assertEquals(5,num);
	}
}
