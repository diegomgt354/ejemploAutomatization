package com.diego.frescoplay.junit.suite;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class exceptions {

	@BeforeClass
	public static void setUpClass(){
		
	}
	
	@AfterClass
	public static void setDownClass(){
		
	}
	
	@Test(expected=IndexOutOfBoundsException.class)//exception
	public void testMain(){
		new ArrayList<Object>().get(0);
	}
	
	@Test(expected=ArithmeticException.class)//exception
	public void testDivideByZero(){
		int x = 10/0;
	}
}
