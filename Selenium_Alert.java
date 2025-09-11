package amdocs.selenium.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe" );
	        
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/delete_customer.php");
	        Thread.sleep(5000);
	        driver.manage().window().maximize();
	        Thread.sleep(5000);
	         driver.findElement((By.name("cusid"))).sendKeys("345");
	         Thread.sleep(5000);
	         driver.findElement(By.name("submit")).submit();
	         
	         Alert alert = driver.switchTo().alert();
	         Thread.sleep(5000);
	         
	         String message = driver.switchTo().alert().getText();
	         System.out.println(message);
	         Thread.sleep(5000);
	         
	         alert.accept();   // clicking the OK button
	         driver.close();
	}

}
