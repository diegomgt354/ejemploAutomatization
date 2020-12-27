package com.diego.frescoplay.learning_linkedin;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.TestCase;

public class todoEnUno extends TestCase {

	static WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeMethod
	public void antes() throws AWTException{
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test(){
		
		WebElement first_name = driver.findElement(By.id("first-name"));
		first_name.sendKeys("Diego");
		WebElement last_name = driver.findElement(By.id("last-name"));
		last_name.sendKeys("Gutierrez");
		WebElement job_title = driver.findElement(By.id("job-title"));
		job_title.sendKeys("programador");
		
		driver.findElement(By.cssSelector("#radio-button-1")).click();
		driver.findElement(By.cssSelector("#radio-button-2")).click();
		driver.findElement(By.cssSelector("#radio-button-3")).click();
		
		driver.findElement(By.cssSelector("input[value='checkbox-1']")).click();
		driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();
		driver.findElement(By.cssSelector("input[value='checkbox-3']")).click();
		
		WebElement select_menu = driver.findElement(By.id("select-menu"));
		Select select = new Select(select_menu);
		//select.selectByIndex(1);
		//select.selectByVisibleText("2-4");
		select.selectByValue("3");
		
		driver.findElement(By.id("datepicker")).sendKeys("05/05/1989"+Keys.RETURN);
		
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		WebElement result = driver.findElement(By.xpath("/html/body/div/h1"));
		wait.until(ExpectedConditions.visibilityOf(result));
		String mensaje = result.getText();
		assert mensaje.length()!=0;
		System.out.println(mensaje);
		
		WebElement alert = driver.findElement(By.cssSelector(".alert.alert-success"));
		wait.until(ExpectedConditions.visibilityOf(alert));
		String mensaje_alert = alert.getText();
		assertEquals(mensaje_alert, "The form was successfully submitted!");
		System.out.println(mensaje_alert);
		//driver.quit();
		
	}
}
