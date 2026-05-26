package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseA {
	public static WebDriver driver;
	public static String url="https://www.google.com";
	public static void launch()
	{
		System.setProperty("WebDriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void application_launch(String url)
	{
		driver.get(url);
	

		
	}
}
	

	