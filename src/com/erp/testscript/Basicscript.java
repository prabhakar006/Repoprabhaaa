package com.erp.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Basicscript {


	public static void main(String[] args) {
		 WebDriver d=new FirefoxDriver();
		 d.get("http://webapp.qedgetech.com/login.php");
		 d.manage().window().maximize();
		 
		 String expval="Login";
		 String actval=d.findElement(By.id("btnsubmit")).getText();
		  if(expval.equals(actval)){
			  System.out.println("Launch is successfully");
			  }
			  else{
				  System.out.println("Launch is unsuccessfully");
		    }
		  
		        d.findElement(By.id("btnreset")).click();
		        Sleeper.sleepTightInSeconds(3);
		        d.findElement(By.id("username")).sendKeys("admin");
		        d.findElement(By.id("password")).sendKeys("master");
		        d.findElement(By.id("btnsubmit")).click();
		        
		        /*Supplires*/
		        d.findElement(By.linkText("Suppliers")).click();
		        
		        /*click on add (Plus symbol)*/
		        d.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		        
		        /*filling data*/
		        d.findElement(By.id("x_Supplier_Name")).sendKeys("ford");
		        d.findElement(By.id("x_Address")).sendKeys("Rao clny");
		        d.findElement(By.id("x_City")).sendKeys("Hyderabad");
		        d.findElement(By.id("x_Country")).sendKeys("India");
		        d.findElement(By.id("x_Contact_Person")).sendKeys("naidu");
		        d.findElement(By.id("x_Phone_Number")).sendKeys("0402715968");
		        d.findElement(By.id("x__Email")).sendKeys("rao8@gmail.com");
		        d.findElement(By.id("x_Mobile_Number")).sendKeys("9852634574");
		        d.findElement(By.id("x_Notes")).sendKeys("hello i am rao");
		        d.findElement(By.id("btnAction")).click();
		        
		        /*click on popup*/
		        d.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		        Sleeper.sleepTightInSeconds(3);
		        d.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		        Sleeper.sleepTightInSeconds(3);
		        
		        /*Stock Items*/
		        
		       Actions act=new Actions(d);
		       act.moveToElement(d.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		       Sleeper.sleepTightInSeconds(2);
		       d.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		       Sleeper.sleepTightInSeconds(2);
		      
		        
		       
		        
		        
		        
		        
		        
		        
		        
		
	
	}

}
