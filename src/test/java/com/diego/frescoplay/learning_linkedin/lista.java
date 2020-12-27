package com.diego.frescoplay.learning_linkedin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lista {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		driver.manage().window().maximize();
	
		List<WebElement> listaDeUnoenUno = driver.findElements(By.cssSelector("#treemenu li:nth-child(n)"));
		List<WebElement> listaDeDosenDos = driver.findElements(By.cssSelector("#treemenu li:nth-child(2n)"));
		List<WebElement> listaDeTresenTres = driver.findElements(By.cssSelector("#treemenu li:nth-child(3n)"));
		List<WebElement> listaDeCuatroenCuatro = driver.findElements(By.cssSelector("#treemenu li:nth-child(4n)"));
		//etc
		
		List<WebElement> listasPares = driver.findElements(By.cssSelector("#treemenu li:nth-child(even)"));
		List<WebElement> listasImpares = driver.findElements(By.cssSelector("#treemenu li:nth-child(odd)"));
		
		System.out.println("Lista total: "+ listaDeUnoenUno.size());
		System.out.println("Lista de dos en dos: "+ listaDeDosenDos.size());
		System.out.println("Lista de tres en tres: "+ listaDeTresenTres.size());
		System.out.println("Lista de cuatro en cuatro: "+ listaDeCuatroenCuatro.size());
		System.out.println("Lista total de pares: "+ listasPares.size());
		System.out.println("Lista total de impares: "+ listasImpares.size());
	}
}
