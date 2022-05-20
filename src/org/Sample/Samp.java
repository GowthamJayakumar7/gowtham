package org.Sample;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Samp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	    WebDriver drive = new ChromeDriver();
	    
	    drive.get("https://www.flipkart.com/");
	    
	    WebElement btnlogin = drive.findElement(By.xpath("//a[@class='_1_3w1N']"));
	    
	    JavascriptExecutor jk = (JavascriptExecutor)drive;
	    
	    jk.executeScript("arguments[0].click()", btnlogin);
	    
	    WebElement txtuser = drive.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    
	    jk.executeScript("arguments[0].setAttribute('value','gowtham7@gmail.com')", txtuser);
	    String text = txtuser.getText();
	    System.out.println(text);
	    
	    WebElement txtpass = drive.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	    
	    jk.executeScript("return arguments[0].setAttribute('value','12345678')", txtpass);

	    String text1 = txtpass.getText();
	    System.out.println(text1);
	    System.out.println(text1);
	    
	    WebElement btnlogin1 = drive.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    
	    jk.executeScript("arguments[0].click()", btnlogin1);
	    
	    

	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
 
	    
	    
	    
	    
	    

	    
	    
	    
	    
	    
	    

	    
	   
	    
	    
	    
	   
	    
	    
	    
	    

	    

	    
	    
	    
	    
	    
	    
	   

	    
	    

	    
	    
	    
	     
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	  
	    
	    
	    
	    
	    
	    
	    
		
		
		
       
	}

}
