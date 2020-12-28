package com.diego.frescoplay.junit.prueba;

public class mensaje {

	public String cadena(int num){
		String men = "";
		if(num>90){
			men="el numero es mayor de 90.";
		}else if(num>60){
			men="el numero es mayor de 60.";
		}else if(num>30){
			men="el numero es mayor de 30.";
		}else{
			men = "el numero se encuentra fuera del parametro admitido.";
		}
		return men;
	}
}
