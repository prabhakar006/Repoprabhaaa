package com.erp.master;

import java.io.IOException;

public class RunScript {

	
	public static void main(String[] args) throws IOException {
		masterlib ml=new masterlib();
		
		String res;
		
		res=ml.Launch("http://webapp.qedgetech.com/login.php");
		System.out.println(res);
		
		res=ml.Login("admin","master");
		System.out.println(res);
		
		
		res=ml.Suppliers("car", "hyderabad", "sec", "India", "harish", "9869584785", "Haris@gmail.com", "8569741236","hello i am harish");
		System.out.println(res);
		
		res=ml.Stockcat("PHHSxcd");
		System.out.println(res);
		
		res=ml.uom("123kkffgk", "seleniumyfuy45455");
		System.out.println(res);
		
		res=ml.Logout();
		
		
		
		
		
		
		
	

	}

}
