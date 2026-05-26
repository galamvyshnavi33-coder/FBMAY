package Allpages;

import org.openqa.selenium.By;

import locators.Base1;

public class Loginpage extends Base1{
	public static By username=By.xpath("//input[@name='email']");
	public static By password=By.xpath("//input[@name='pass']");
	public static By button=By.xpath("//span[text()='Log in']\")");
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
