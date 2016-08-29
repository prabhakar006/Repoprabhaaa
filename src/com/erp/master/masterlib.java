package com.erp.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class masterlib {
	public static Properties pr;
	public static FileInputStream fi;
	public static WebDriver d;
	public static String expval,actval;
	
	 public String Launch(String url) throws IOException{
		 pr=new Properties();
		 fi=new FileInputStream("C:\\Users\\prabhakar.v\\Desktop\\Selenium\\ERP\\src\\com\\erp\\properties\\login.properties");
		 pr.load(fi);
		 d=new FirefoxDriver();
		 d.get(url);
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 expval="Login";
		 actval=d.findElement(By.id("btnsubmit")).getText();
		 System.out.println(actval);
		 if(expval.equals(actval)){
			return "pass";
		 }
		 else{
		 return "fail";
		 }
		 }
		 
		 public String Login(String uname,String pwd){
			 
			 
			
			 d.findElement(By.id(pr.getProperty("reset"))).click();
		     d.findElement(By.id(pr.getProperty("username"))).sendKeys(uname);
			 d.findElement(By.id(pr.getProperty("password"))).sendKeys(pwd);
			 d.findElement(By.id(pr.getProperty("login"))).click();
			 expval="Logout";
			 actval=d.findElement(By.linkText("Logout")).getText();
			 
			 if(expval.equals(actval)){
				 return "pass";
			 }
			 else {
				 return "fail";
				
			}
			 
		 }
		 public String Suppliers(String sname,String saddr,String scity,String scountry,
				 String scnctprsn,String sphn,String semail,String smblnum,String snotes){
			 
			 
			 d.findElement(By.linkText("Suppliers")).click();
			 d.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			 d.findElement(By.id("x_Supplier_Name")).sendKeys(sname);
			 d.findElement(By.id("x_Address")).sendKeys(saddr);
			 d.findElement(By.id("x_City")).sendKeys(scity);
			 d.findElement(By.id("x_Country")).sendKeys(scountry);
			 d.findElement(By.id("x_Contact_Person")).sendKeys(scnctprsn);
			 d.findElement(By.id("x_Phone_Number")).sendKeys(sphn);
			 d.findElement(By.id("x__Email")).sendKeys(semail);
			 d.findElement(By.id("x_Mobile_Number")).sendKeys(smblnum);
			 d.findElement(By.id("x_Notes")).sendKeys(snotes);
			 d.findElement(By.id("btnAction")).click();
		        
		        /*click on popup*/
		        d.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		        d.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		        expval="Logout";
			    actval=d.findElement(By.linkText("Logout")).getText();
			    if(expval.equals(actval)){
				 return "pass";
				 }
			 else {
				return "fail";
			}
				 
			 }
		 public String Stockcat(String cname)
		 {
			 expval="Add succeeded";
			 
			 Actions act=new Actions(d);
		       act.moveToElement(d.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		       Sleeper.sleepTightInSeconds(2);
		       d.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		       Sleeper.sleepTightInSeconds(2);
		       
		       d.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		       Sleeper.sleepTightInSeconds(2);
		       d.findElement(By.id("x_Category_Name")).sendKeys(cname);
		       Sleeper.sleepTightInSeconds(2);
		       
		       d.findElement(By.id("btnAction")).click();
		       Sleeper.sleepTightInSeconds(2);
		       
		       d.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		       
		       actval=d.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
		       
		       d.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		       
		       
		       
		       if(expval.equals(actval)){
		    	   return "pass";
		       }
		       else {
				return "fail";
			}
		       }
		  public String uom(String uid,String udes){
			  
			  Actions act1=new Actions(d);
			  act1.moveToElement(d.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			   Sleeper.sleepTightInSeconds(3);
			  
			  d.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
			  
			  d.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			  d.findElement(By.xpath(".//*[@id='x_UOM_ID']")).sendKeys(uid);
			  d.findElement(By.xpath(".//*[@id='x_UOM_Description']")).sendKeys(udes);
			  d.findElement(By.xpath(".//*[@id='btnAction']")).click();
			  d.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			  d.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			  
			  expval="Add succeeded";
			  actval=d.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
			  if(expval.equals(actval)){
				  return "pass";
			  }
			  else{
				  return "fail";
		  }
			  }
			  
			  
			  
	  public String Logout() {
		  d.findElement(By.xpath(".//*[@id='logout']")).click();
		return null;
			
			
		}

		public String Close() {
			d.close();
			return null;
			
			
		}
		
		       
		       
		
		 }
		 
		 
			
			 
			 
					
			 
		 
		 
			 
			 
			 
			 
			 
				 
			 
			 
			 
			
			 
			 
		
			 
		 
		 
		
		 
		
		 
	 
	



