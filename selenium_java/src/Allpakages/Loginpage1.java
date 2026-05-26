package Allpakages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.Base1;

public class Loginpage1 extends Base1
{
	public static By emailid=By.name("email");
	public static WebElement webemailid=driver.findElement(emailid);
	public static By loginbutton=By.name("login");
	public static WebElement weblogin=driver.findElement(loginbutton);
	public static void main(String[] args) {		
		 //String title=GenericMethodsA.Gettitle();
		System.out.println("hello");

	}

}

