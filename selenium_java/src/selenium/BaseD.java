package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseD {
	public static WebDriver driver;
	public static String url="https://demo.guru99.com/test/newtours/register.php";
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
