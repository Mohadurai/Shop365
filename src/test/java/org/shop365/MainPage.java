package org.shop365;



import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
	
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Maven\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shop365.sg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(10000000, TimeUnit.SECONDS);
		
		TakesScreenshot tk = (TakesScreenshot)driver;

		WebElement loginpage = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/a"));
		loginpage.click();
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Maven\\Screenshot\\login.png");
		FileUtils.copyFile(temp, desc);
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"emmail_login\"]"));
		login.sendKeys("duraimohandass@gmail.com");
				
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password_login\"]"));
		pass.sendKeys("Mohan1990");
		
		File temp1 = tk.getScreenshotAs(OutputType.FILE);
		File desc1 = new File("C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Maven\\Screenshot\\loginpass.png");
		FileUtils.copyFile(temp1, desc1);
		
		
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/fieldset/div/form/button[1]"));
		button.click();
		
				
		WebElement search = driver.findElement(By.id("q"));
		search.sendKeys("amazon kindle");
		
		File temp2 = tk.getScreenshotAs(OutputType.FILE);
		File desc2 = new File("C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Maven\\Screenshot\\Search.png");
		FileUtils.copyFile(temp2, desc2);
		
		
		WebElement butten = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		butten.click();
		WebElement butten1 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/strong/a"));
		butten1.click();	
		
		File temp3 = tk.getScreenshotAs(OutputType.FILE);
		File desc3 = new File("C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Maven\\Screenshot\\Item.png");
		FileUtils.copyFile(temp3, desc3);
		
		
		WebElement shoping = driver.findElement(By.xpath("	/html/body/div[1]/main/div[2]/div/div/div[1]/div[2]/div[1]/div[6]/div[6]/div/div[1]/div/input"));
		shoping.click();	

		
		
		//WebElement day = driver.findElement(By.xpath("//*[@id=\"select2-select-shipping-method-container\"]"));
		//day.click();	
		
		Thread.sleep(5000);
		WebElement addcart = driver.findElement(By.id("add-to-cart"));
		//addcart.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", addcart);
		
		
		File temp4 = tk.getScreenshotAs(OutputType.FILE);
		File desc4 = new File("C:\\Users\\7oaseb.com.saaa\\eclipse-workspace\\Maven\\Screenshot\\addcart.png");
		FileUtils.copyFile(temp4, desc4);
		
		driver.quit();
	}

		}

	

