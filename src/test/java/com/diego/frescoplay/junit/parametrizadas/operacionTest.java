package com.diego.frescoplay.junit.parametrizadas;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class operacionTest {

	private int numA;
	private int numB;
	private int expected;
	
	public operacionTest(int numA, int numB, int expected){
		this.numA = numA;
		this.numB = numB;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{1, 1, 2},
            {2, 2, 4},
            {3, 2, 5},
            {4, 5, 9},
            {5, 5, 10}, 
            {6, 6, 12},
            {7, 8, 15}
		});
	}
	
	//@SuppressWarnings("deprecation")//deshabilita advertencia de codigo obsoleto - no es necesario ponerlo XD
	//@SuppressWarnings("unused")//deshabilita advertencia de variables sin usar - no es necesario ponerlo XD
	@Test
	public void test(){
		Assert.assertEquals(operacion.suma(numA, numB), expected);
	}
}