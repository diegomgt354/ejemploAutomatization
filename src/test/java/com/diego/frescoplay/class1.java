package com.diego.frescoplay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class1 {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//espera implicita para todos XD
		//String ubicationFIREFOX = System.getProperty("user.dir")+"\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver", ubicationFIREFOX);
		//driver = new FirefoxDriver();
		//String ubicationIE = System.getProperty("user.dir")+"\\IEDriverServer.exe";
		//System.setProperty("webdriver.ie.driver", ubicationIE);
		//driver = new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/");
		
		System.out.println("Titulo de la página: "+driver.getTitle());
		
		WebElement buscador = driver.findElement(By.name("search"));
		buscador.sendKeys("wait");
		buscador.sendKeys(Keys.ENTER);
		
		String urlActual = driver.getCurrentUrl();
		System.out.println(urlActual);
		
		//WebElement link = driver.findElement(By.xpath("//*[@id='___gcse_0']//div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]//a"));
		//wait.until(ExpectedConditions.elementToBeClickable(link));
		//link.click();
		
		//WebElement linkTextPartial = driver.findElement(By.partialLinkText("Selenium"));
		
		String parentHandler = driver.getWindowHandle();//almacena ID de ventana original
		assert driver.getWindowHandles().size()==1;//comprueba que no existan otras ventanas abiertas		
		
		WebElement linkText = driver.findElement(By.linkText("Commands · Selenium IDE"));
		wait.until(ExpectedConditions.elementToBeClickable(linkText));
		linkText.click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));//espera a que la otra ventana cargue // espera explicita
		
		for(String windowsHandler : driver.getWindowHandles()){//recorrer hasta encontrar el controlador de la nueva ventana
			if(!parentHandler.contentEquals(windowsHandler)){
				driver.switchTo().window(windowsHandler);
				driver.close();//cerrar ventana
				break;
			}
		}
		
		driver.switchTo().window(parentHandler);
		
		
		//wait.until(ExpectedConditions.invisibilityOf(buscador));
		
		WebElement buscador2 = driver.findElement(By.name("search"));
		buscador2.clear();
		buscador2.sendKeys("python");
		
		//driver.close();
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		String text = driver.findElement(By.xpath("//*[@id='banner-blm']/h2/strong")).getText();
		System.out.println(text);
		
		WebElement opciones = driver.findElement(By.id("aboutArrow"));
		wait.until(ExpectedConditions.elementToBeClickable(opciones));
		opciones.click();
		
	
		assert driver.findElement(By.xpath("//a[starts-with(text(),'Ab')]")) != null;
		assert driver.findElement(By.xpath("//a[contains(text(),'vernan')]")) != null;
		
		//driver.quit();
	}

}
