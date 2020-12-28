package com.diego.frescoplay.junit.prueba;

import org.junit.Assert;
import org.junit.Test;

public class testMensaje {

	@Test
	public void test(){
		mensaje mm =  new mensaje();
		Assert.assertEquals("el numero es mayor de 30.", mm.cadena(50));
		
	}
}
