package com.diego.frescoplay.learning_linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptExecutor {

	static WebDriver driver;
	static WebDriverWait wait;
	static JavascriptExecutor js;
	
	public static void main(String[] args) {
	
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement btnOpen = driver.findElement(By.id("modal-button"));
		wait.until(ExpectedConditions.visibilityOf(btnOpen));
		btnOpen.click();
		
		WebElement btnClose = driver.findElement(By.id("close-button"));
		wait.until(ExpectedConditions.visibilityOf(btnClose));
		
		js.executeScript("arguments[0].click();", btnClose);
		
		//driver.close();
		
	}
}
