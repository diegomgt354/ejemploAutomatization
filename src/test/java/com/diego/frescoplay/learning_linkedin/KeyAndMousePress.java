package com.diego.frescoplay.learning_linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyAndMousePress {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement buscar = driver.findElement(By.id("name"));
		buscar.click();
		buscar.clear();
		buscar.sendKeys("Meaghan Lewis");
		
		WebElement btnBuscar = driver.findElement(By.id("button"));
		btnBuscar.click();
		
		
		driver.quit();
	}
}
