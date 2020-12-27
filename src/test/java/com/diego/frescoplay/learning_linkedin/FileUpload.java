package com.diego.frescoplay.learning_linkedin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class FileUpload {

	static WebDriver driver;
	static WebDriverWait wait;
	static Robot robot;
	
	@BeforeMethod
	public void antes() throws AWTException{
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		robot = new Robot();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/fileupload");
	}
	
	@Test
	public void test1() throws InterruptedException{
		WebElement upload = driver.findElement(By.id("file-upload-field"));
		wait.until(ExpectedConditions.visibilityOf(upload));
		upload.sendKeys("cv2021.pdf");
		Thread.sleep(3000);
	}
	
	@Test
	public void test2() throws InterruptedException{
		/*WebElement btnChoose = driver.findElement(By.cssSelector(".form-control"));
		wait.until(ExpectedConditions.elementToBeClickable(btnChoose));
		btnChoose.click();*/
		
		WebElement btnChoose = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".form-control")));
		btnChoose.click();
		
		String file = "C:\\Users\\Administrador\\Downloads\\img_prueba.jpg";
		StringSelection seleccionTexto = new StringSelection(file);
		Clipboard transferir = Toolkit.getDefaultToolkit().getSystemClipboard();
		transferir.setContents(seleccionTexto, null);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void despues(){
		driver.quit();
	}
	
	/*
	public static void main(String[] args) {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement upload = driver.findElement(By.id("file-upload-field"));
		wait.until(ExpectedConditions.visibilityOf(upload));
		upload.sendKeys("cv2021.pdf");
	}
	*/
}
