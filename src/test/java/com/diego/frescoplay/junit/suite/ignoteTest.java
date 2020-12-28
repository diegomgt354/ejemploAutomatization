package com.diego.frescoplay.junit.suite;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ignoteTest {

	@Ignore("Este test es ignorado, asi que no se ejecutara")
	@Test
	public void test1(){
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2(){
		Assert.assertTrue(true);
	}
	
}
