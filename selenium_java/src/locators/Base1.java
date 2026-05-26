package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	public static WebDriver driver;
	public static String url="https://fb.com";
	public static void luanch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public static void application_luanch(String url)
	{
		driver.get(url);
	}

}

