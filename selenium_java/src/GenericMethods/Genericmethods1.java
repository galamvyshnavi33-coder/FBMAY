package GenericMethods;

import org.openqa.selenium.WebElement;

import locators.BaseC;

public class Genericmethods1 extends BaseC{
	public static void sendkeys(String text,WebElement abc)
	{
		abc.sendKeys(null);
	}
	public static void click(WebElement xyz)
	{
		xyz.click();
		
	}
	public static String Gettitle()
	{
		return driver.getTitle();
	}
	
	

}
