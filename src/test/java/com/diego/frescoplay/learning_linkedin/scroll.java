package com.diego.frescoplay.learning_linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scroll {

	static WebDriver driver;
	static WebDriverWait wait;
	static Actions action;
	
	public static void main(String[] args) throws InterruptedException {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();
		WebElement fullName = driver.findElement(By.id("name"));
		wait.until(ExpectedConditions.visibilityOf(fullName));
		action.moveToElement(fullName);
		action.perform();//realizar
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
