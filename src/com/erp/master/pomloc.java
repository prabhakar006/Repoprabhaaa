package com.erp.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomloc {
	
	@FindBy(id="username")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pwd;
	
	
	@FindBy(id="btnsubmit")
	WebElement login;
	
	@FindBy(id="btnreset")
	WebElement reset;
	 
	public void adminlogin(String un,String pswrd){
		reset.click();
		uname.sendKeys(un);
		pwd.sendKeys(pswrd);
		login.click();
	}
	
	

}
