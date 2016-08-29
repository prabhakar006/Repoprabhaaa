package com.erp.master;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static masterlib ml=new masterlib();
	
	@BeforeTest
	public void Login(){
		ml.Login("admin", "master");
	}
	
	@AfterTest
	public void Logout(){
		ml.Logout();
	}
	
	@BeforeSuite
	public void Launch() throws IOException{
		ml.Launch("http://webapp.qedgetech.com/login.php");
	}
	
	@AfterSuite
	public void Close(){
		ml.Close();
	}
	

}
