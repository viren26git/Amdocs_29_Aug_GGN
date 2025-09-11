package amdocs.selenium.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemos {
	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe" );
	        
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Alerts.html");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(3000);
	        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	        Thread.sleep(6000);
	        driver.findElement(By.id("CancelTab")).click();
	        Thread.sleep(3000);
	        
	        Alert act = driver.switchTo().alert();
	        String msg = act.getText();
	        if(msg.equals("Press a Button !")){
	        	System.out.println("The actual alert message is displayed");
	        }
	        else
	        {
	        	System.out.println("TIn correct messsage of alert message");
	        }
	        act = driver.switchTo().alert();
	        act.accept();
	        
	        driver.close();

	}

}
