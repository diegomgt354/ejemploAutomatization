package com.diego.frescoplay.poi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GoogleSearch {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void antes(){
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.selenium.dev/");
	}
	
	//prueba
	@Test(dataProvider="testdata")
	public void test(String texto) {
		
		WebElement buscador = driver.findElement(By.name("search"));
		buscador.sendKeys(texto);
		buscador.sendKeys(Keys.ENTER);	
	}
	
	//fuente de datos de prueba
	@DataProvider(name="testdata")
	public Object[][] testDataFeed() throws IOException{
		String ubi = System.getProperty("user.dir")+"\\libro1.xlsx";
		ReadExcelFile config = new ReadExcelFile(ubi);
		int rows = config.getRowsCount(0);
		Object[][] searchName = new Object[rows][1];
		for(int i=0;i<rows;i++){
			searchName[i][0] = config.getData(0,i,0);
		}
		return searchName;
	}

	
	@AfterMethod
	public void despues(){
		driver.quit();
	}
}
