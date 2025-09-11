package amdocs.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocators {

	public static void main(String[] args) throws InterruptedException { 
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe" );
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.findElement(By.className("a-button-text")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles"); 
        Thread.sleep(6000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(6000);
        driver.findElement(By.linkText("GPS")).click();
        Thread.sleep(6000);
        driver.findElement(By.partialLinkText("Motorola G64 5G (Mint Green, 12GB RAM, 256GB Storage) | Expandable Upto 2TB")).click();
        Thread.sleep(6000);
        driver.navigate().back();
        
        Thread.sleep(6000);
        driver.navigate().to("http://login.yahoo.com");
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("#login-username")).sendKeys("admin@yahoo.com");
        Thread.sleep(6000);
        driver.findElement(By.id("login-signin")).click();
        
        driver.quit();
	}

}
