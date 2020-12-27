package com.diego.frescoplay.learning_linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args){
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Park Avenue, Emeryville, CA, USA");
		
		WebElement elegir = driver.findElement(By.xpath("/html/body/div[2]/div[1]"));
		wait.until(ExpectedConditions.visibilityOf(elegir));
		elegir.click();
		
		driver.quit();
	}
}
