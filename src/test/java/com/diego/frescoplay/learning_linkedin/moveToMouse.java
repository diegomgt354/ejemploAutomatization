package com.diego.frescoplay.learning_linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class moveToMouse {

	static WebDriver driver;
	static WebDriverWait wait;
	static Actions action;
	
	public static void main(String[] args) {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		
		WebElement imagen = driver.findElement(By.id("image"));
		wait.until(ExpectedConditions.visibilityOf(imagen));
		
		WebElement imagenbox = driver.findElement(By.id("box"));
		wait.until(ExpectedConditions.visibilityOf(imagenbox));
		
		//action.clickAndHold(imagen).moveToElement(imagenbox).release(imagenbox).build().perform();
		action.dragAndDrop(imagen, imagenbox).build().perform();
		
		
		//By.cssSelector
		//<input class='nuevo-ejemplo realidad' id='aidi'>
		//input[class^='nuev'] //inicial
		//input[class*='ejemplo'] //medio
		//input[class$='realidad']  //final
		
		
		
		
		//driver.close();
		
	}
}
