package automatingUptoPayement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automating  {
	
	
	public static void main(String[] args) throws Throwable  {
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Ecommerce\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.lightinthebox.com/");
				
	           WebElement a = driver.findElement(By.xpath("(//button[@class='close'])[2]"));				 
				a.click();
				
//				Thread.sleep(20000);
			
				WebElement a1 = driver.findElement(By.xpath("//input[@id='keywords']"));
		        a1.sendKeys("watches for men");
		        WebElement a3 = driver.findElement(By.xpath("//button[@title='click to search']"));
			a3.click();
			WebElement a4 = driver.findElement(By.xpath("//span[contains(text(),'Blue Grey Gold')]"));
		a4.click();
		       WebElement a5 = driver.findElement(By.xpath("(//img[@class='sku-img'])[2]"));
	           a5.click();
	           WebElement a6 = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
	           a6.click();
	           
	}}
		
		
 