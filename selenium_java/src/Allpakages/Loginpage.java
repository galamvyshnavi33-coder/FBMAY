package Allpakages;

import org.openqa.selenium.By;

import selenium.BaseC;

public class Loginpage extends BaseC {
	public static By customerid=By.name("cusid");
	public static By Submit=By.name("submit");
	public static void Entercustomerid(String id)
	{
		driver.findElement(customerid).sendKeys(id);
	}
	public static void submitbutton()
	{
		
		driver.findElement(Submit).click();
	}


}
