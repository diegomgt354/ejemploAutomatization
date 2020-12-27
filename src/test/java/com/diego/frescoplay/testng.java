package com.diego.frescoplay;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {

	//instala TestNG en marketplace y agrega en Configure Build Pach
	
	//Before
	
	/*
	 * @BeforeGroups: el conjunto de grupos al que se ejecutará el método de configuración antes. Y se asegura que 
	 * este método se ejecutará poco antes de que se invoque el primer método de prueba, que pertenece a cualquiera 
	 * de estos grupos.
	 */
	@BeforeGroups
	public void BeforeGroups(){
		System.out.println("BeforeGroups");
	}
	/*
	 * @BeforeSuite: el método anotado se ejecutará antes de que se hayan ejecutado todas las pruebas 
	 * de esta suite.
	 */
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("BeforeSuite");
	}
	
	/*
	 * @BeforeTest: el método anotado se ejecutará antes de que se ejecute cualquier método de prueba 
	 * que pertenezca a las clases dentro de la etiqueta <test>.
	 */
	@BeforeTest
	public void BeforeTest(){
		System.out.println("BeforeTest");
	}
	
	/*
	 * @BeforeClass: el método anotado se ejecutará antes de que se invoque el primer método de prueba en la clase actual.
	 */
	@BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass");
	}
	
	/*
	 * @BeforeMethod: el método anotado se ejecutará antes de cada método de prueba.
	 */
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod");
	}
	
	//Test
	/*
	 * test: marca una clase o un método como parte de la prueba.
	 */
	@Test
	public void test1(){
		System.out.println("test1");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	//After
	/*
	 * @AfterMethod: el método anotado se ejecutará después de cada método de prueba.
	 */
	@AfterMethod
	public void AfterMethod(){
		System.out.println("AfterMethod");
	}
	
	/*
	 * @AfterClass: el método anotado se ejecutará después de que se hayan ejecutado todos los métodos 
	 * de prueba en la clase actual.
	 */
	@AfterClass
	public void AfterClass(){
		System.out.println("AfterClass");
	}
	
	/*
	 * @AfterTest: el método anotado se ejecutará después de que se hayan ejecutado todos los métodos 
	 * de prueba que pertenecen a las clases dentro de la etiqueta <test>.
	 */
	@AfterTest
	public void AfterTest(){
		System.out.println("AfterTest");
	}
	
	/*
	 * @AfterSuite: el método anotado se ejecutará después de que se hayan ejecutado todas las pruebas de esta suite.
	 */
	@AfterSuite
	public void AfterSuite(){
		System.out.println("AfterSuite");
	}
	
	/*
	 * AfterGroups: el conjunto de grupos después de los cuales se ejecutará el método de configuración. 
	 * Y se confirma que este método se ejecuta poco después de que se invoca el último método de prueba, que 
	 * pertenece a cualquiera de estos grupos.
	 */
	@AfterGroups
	public void AfterGroups(){
		System.out.println("AfterGroups");
	}
	
	/*
	@Listeners : define a los oyentes en una clase de prueba.
	@DataProvider : marca un método para proporcionar datos para un método de prueba. Ahora, este método anotado debe 
	devolver un Objeto [] [] donde a cada Objeto [] se le puede asignar la lista de parámetros del método de prueba. 
	El método @Test que requiere obtener datos de este proveedor de datos debe usar un nombre de proveedor de datos 
	equivalente al nombre de esta anotación.

	@Factory : marca un método como una fábrica que devuelve objetos que serán utilizados por TestNG como clases de 
	prueba. El método debe devolver Object [].

	@Parameters : describe cómo pasar parámetros a un método @Test.
	*/
	
}
