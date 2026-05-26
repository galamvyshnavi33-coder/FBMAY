package Allpakages;

import org.openqa.selenium.By;

import locators.BaseA;

public class Allpakages1 extends BaseA{
	
	public static By username=By.xpath("//input[@name='email']");
	public static By password=By.xpath("//input[@name='pass']");
	public static By button=By.xpath("//span[text()='Log in']");
	
	public static void user_name(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	public static void password1(String password1)
	{
	
		driver.findElement(password).sendKeys(password1);
	}
	public static void login()
	{
		driver.findElement(button).click();
	}
}

	

	