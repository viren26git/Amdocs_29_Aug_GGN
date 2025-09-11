package amdocs.selenium.programs;

import java.util.Iterator;
import java.util.Set;

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
	        
	        // shiting the focu to anther website for the pop-up demo
	        
	        driver.get("http://demo.guru99.com/popup.php");
	        
	        String mainwindow = driver.getWindowHandle();
	        System.out.println("current main window hanlder " + mainwindow);
	        
	        Thread.sleep(5000);
	        driver.findElement((By.xpath("//*[contains(@href,'popup.php')]"))).click();
	        Thread.sleep(5000);
	        
	     Set<String> s1 = driver.getWindowHandles();
	     Iterator<String> i1 = s1.iterator();
	     
	     while(i1.hasNext())
	     {
	    	 String childWindow = i1.next();
	    	 System.out.println("current main window hanlder " + childWindow);
	    	 Thread.sleep(5000);
	    	 
	    	 driver.switchTo().window(childWindow); // you have witched th focus to the child window
	    	 
	     }
	     driver.switchTo().window(mainwindow);
	     driver.quit();

	}

}
