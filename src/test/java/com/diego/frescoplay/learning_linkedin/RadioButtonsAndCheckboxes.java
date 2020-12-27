package com.diego.frescoplay.learning_linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonsAndCheckboxes {

	static WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeMethod
	public void antes(){
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void radioButtons() throws InterruptedException{
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement radio1 = driver.findElement(By.id("radio-button-1"));
		radio1.click();
		
		Thread.sleep(2000);
		
		WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radio2.click();
		
		Thread.sleep(2000);
		
		WebElement radio3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radio3.click();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void Checkboxes() throws InterruptedException{
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		Thread.sleep(2000);
		
		WebElement check1 = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
		wait.until(ExpectedConditions.visibilityOf(check1));
		check1.click();
		
		Thread.sleep(2000);
		
		WebElement check2 = driver.findElement(By.id("checkbox-2"));
		wait.until(ExpectedConditions.visibilityOf(check2));
		check2.click();
		
		Thread.sleep(2000);
		
		WebElement check3 = driver.findElement(By.xpath("//*[@id='checkbox-3']"));
		wait.until(ExpectedConditions.visibilityOf(check3));
		check3.click();		
		
	}
	
	@AfterMethod
	public void despues(){
		driver.close();
	}
	
	/*
	public static void main(String[] args) throws Exception {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement radio1 = driver.findElement(By.id("radio-button-1"));
		radio1.click();
		
		Thread.sleep(2000);
		
		WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radio2.click();
		
		Thread.sleep(2000);
		
		WebElement radio3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radio3.click();
		
	}
	*/
}
