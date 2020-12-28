package com.diego.frescoplay.junit;


import org.junit.Test;

import static org.junit.Assert.*;


public class junitEjercicios {

	@Test
	public void testAssertArrayEquals(){
		byte[] expected = "test".getBytes();
		byte[] actual = "test".getBytes();
		assertArrayEquals("Mensaje que sale si es Error asserArrayEquals.",expected,actual);
	}
	
	@Test
	public void testAssertEquals(){
		assertEquals("Mensaje que sale si es Error assertEquals.", "selenium","selenium");
	}
	
	@Test
	public void testAssertFalse(){
		assertFalse("Mensaje que sale si NO es Falso assertFalse.", false);
	}
	
	@Test
	public void testAssertTrue(){
		assertTrue("Mensaje que sale si NO es Verdadero assertTrue.", true);
	}
	
	@Test
	public void testAssertNotNull(){
		assertNotNull("Mensaje que sale si NO es null",new Object());
	}
	
	@Test
	public void testAssertNotSame(){
		Integer number = Integer.valueOf(62); 
		assertNotSame("Mensaje si son iguales assertNotSame.",number, 22);
	}
}

