package com.erp.master;

import org.apache.poi.hslf.record.NotesAtom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Suppliers {
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement Suppliers;
	
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[.]/div[1]/div[1]/div[1]/div/a")
	WebElement add;
	
	@FindBy(xpath=".//*[@id='x_Supplier_Name']")
	WebElement SupplierName;
	
	@FindBy(xpath=".//*[@id='x_Address']")
	WebElement Address;
	
	@FindBy(xpath=".//*[@id='x_City']")
	WebElement City;
	
	@FindBy(xpath=".//*[@id='x_Country']")
	WebElement Country;
	
	@FindBy(xpath=".//*[@id='x_Contact_Person']")
	WebElement ContactPerson;
	
	@FindBy(xpath=".//*[@id='x_Phone_Number']")
	WebElement PhoneNumber;
	
	@FindBy(xpath=".//*[@id='x__Email']")
	WebElement Email;
	
	@FindBy(xpath=".//*[@id='x_Mobile_Number']")
	WebElement MobileNumber;
	
	
	@FindBy(xpath=".//*[@id='x_Notes']")
	WebElement Notes;
	
	@FindBy(xpath=".//*[@id='btnAction']")
	WebElement adding;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement Ok;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement OK;
	
	 
	
	
	
	public void Supplierslink(String sname,String Addr,String City,String Country,String ContactPerson,String PhoneNumber,
			String Email,String MobileNumber,String Notes){
		Suppliers.click();
		add.click();
		Sleeper.sleepTightInSeconds(3);
		SupplierName.sendKeys(sname);
		Address.sendKeys(Addr);
		this.City.sendKeys(City);
		this.Country.sendKeys(Country);
		this.ContactPerson.sendKeys(ContactPerson);
		this.PhoneNumber.sendKeys(PhoneNumber);
		this.Email.sendKeys(Email);
		this.MobileNumber.sendKeys(MobileNumber);
		this.Notes.sendKeys(Notes);
		adding.click();
		Ok.click();
		OK.click();
	}

}
