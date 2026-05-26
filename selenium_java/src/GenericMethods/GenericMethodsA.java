package GenericMethods;

import org.openqa.selenium.WebElement;

import selenium.Base1;

public class GenericMethodsA extends Base1
{
	public static void SendKeys(String text,WebElement abc)
	{
		abc.sendKeys(text);
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

	