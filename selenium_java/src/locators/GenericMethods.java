package locators;

import org.openqa.selenium.WebElement;

public class GenericMethods extends BaseC{
	public static void sendkeys(String text,WebElement abc)
	{
		abc.sendKeys(text);
		
	}
	public static String getenteredvalue(WebElement etc)
	{
		return etc.getDomProperty("value");
	}

}
