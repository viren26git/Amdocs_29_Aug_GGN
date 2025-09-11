package selenium.programs;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.*;	

public class HandleWebElements {
	
	public static void main(String[] args) throws InterruptedException {									
		
    	// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			

        //-------------------------------RADIO-BUTTON----------------------------//
        driver.get("http://demo.guru99.com/test/radio.html");					
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");		
        System.out.println("radio 1 is selected or not" + radio1.isSelected());
        System.out.println("radio 2 is selected or not" + radio2.isSelected());
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        
        Thread.sleep(4000);
       
        //------------------------------ CHECKBOX----------------------------------//
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
        
        Thread.sleep(5000); 
        //Selecting Checkbox and using isSelected Method		
        
        driver.get("http://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));		
        Thread.sleep(8000); 
        for (int i=0; i<3; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+ chkFBPersist.isSelected());							
        }		
        Thread.sleep(8000);
        
        //-------------------------------DROP-DOWN---------------------------------//
        driver.get("http://demo.guru99.com/test/newtours/register.php");	
        Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA"); //1 : Method- selectByVisibleText()
		Thread.sleep(7000); 
		drpCountry.selectByValue("ALGERIA");   //2 : Method- selectByValue()
		Thread.sleep(3000); 
		drpCountry.selectByIndex(10); 
		
		boolean b = drpCountry.isMultiple();
		System.out.println("is this drop down a multiple selection or not " + b);
		
		List<WebElement> li = drpCountry.getOptions();
		System.out.println("total number of options inside this " + li.size());
		
		Iterator<WebElement> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println("the options are " + it.next().getText());
		}
		Thread.sleep(9000); 

		
		//------------------------MULTI SELECT DROP-DOWN BOX------------------------//
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(3000);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(2);           //3 : selectByIndex()
		Thread.sleep(2000);
		
		fruits.deselectAll();
		Thread.sleep(3000);
		driver.close();		    		
    }	
}
