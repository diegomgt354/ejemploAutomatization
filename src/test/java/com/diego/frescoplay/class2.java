package com.diego.frescoplay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class2 {

	static WebDriver driver;
	static WebDriverWait wait;
	static Actions action;
	
	public static void main(String[] args) {
		
		String ubicationCHROME = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ubicationCHROME);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//espera implicita para todos XD
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		System.out.println("Titulo de la página: "+driver.getTitle());
		
		WebElement inicialM   = driver.findElement(By.id("draggable"));
		
		assert inicialM != null;//si existe
		
		WebElement finalM = driver.findElement(By.id("droppable"));
		
		//mover elemento a ...
		Action moveMouse = action.moveToElement(inicialM).build(); //construir
		moveMouse.perform(); //realizar
		
		//mover elemento a otro elemento
		Action moverAElemento = action.clickAndHold(inicialM).moveToElement(finalM).release(finalM).build();
		moverAElemento.perform();
		
		
		
		driver.findElement(By.id("droppableExample-tab-accept")).click();
		
		WebElement notAcceptable = driver.findElement(By.id("notAcceptable"));
		WebElement acceptable = driver.findElement(By.id("acceptable"));
		WebElement dropped = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]"));
		
		wait.until(ExpectedConditions.visibilityOf(dropped));
		
		Action inicio = action.clickAndHold(notAcceptable).moveToElement(dropped).release(dropped).build();
		inicio.perform();
		
		Action finalD = action.clickAndHold(acceptable).moveToElement(dropped).release(dropped).build();
		finalD.perform();
		
		driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
		
		WebElement dragBox = driver.findElement(By.id("dragBox"));
		WebElement notGreedyInnerDropBox = driver.findElement(By.id("notGreedyInnerDropBox"));
		WebElement notGreedyDropBox = driver.findElement(By.id("notGreedyDropBox"));
		WebElement greedyDropBoxInner = driver.findElement(By.id("greedyDropBoxInner"));
		WebElement greedyDropBox = driver.findElement(By.id("greedyDropBox"));
		
		Action inicio2 = action.clickAndHold(dragBox).moveToElement(notGreedyInnerDropBox).release(notGreedyInnerDropBox).build();
		inicio2.perform();
		
		Action inicio3 = action.clickAndHold(dragBox).moveToElement(notGreedyDropBox).release(notGreedyDropBox).build();
		inicio3.perform();
		
		Action inicio4 = action.clickAndHold(dragBox).moveToElement(notGreedyInnerDropBox).release(notGreedyInnerDropBox).build();
		inicio4.perform();
		
		Action inicio5 = action.clickAndHold(dragBox).moveToElement(greedyDropBoxInner).release(greedyDropBoxInner).build();
		inicio5.perform();
		
		Action inicio6 = action.clickAndHold(dragBox).moveToElement(greedyDropBox).release(greedyDropBox).build();
		inicio6.perform();
		
		
		//  driver.quit();
		
	}
}
