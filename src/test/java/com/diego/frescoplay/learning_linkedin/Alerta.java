package com.diego.frescoplay.learning_linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerta {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		WebElement btnAlerta = driver.findElement(By.id("alert-button"));
		wait.until(ExpectedConditions.visibilityOf(btnAlerta));
		btnAlerta.click();
		
		Alert alerta = driver.switchTo().alert();
		String textoAlert = alerta.getText();
		System.out.println(textoAlert);
		alerta.accept();
	}
}
