package com.erp.master;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomexecution {
	@Test
	    public void login(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com/login.php");
		driver.manage().window().maximize();
		
		pomloc pl=PageFactory.initElements(driver, pomloc.class);
		pl.adminlogin("admin", "master");
	
		
	Suppliers ps=PageFactory.initElements(driver, Suppliers.class);
	ps.Supplierslink("Car", "sec", "hyderabad", "India", "Harish", "9858746958", "Hari@gmail.com", "7799586974", "hello");
		
		
		
		
		
	}

}
