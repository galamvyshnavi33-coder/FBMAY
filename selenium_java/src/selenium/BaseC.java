package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseC {

	
		public static WebDriver driver;
		public static String url="https://demo.guru99.com/test/delete_customer.php";
		public static void launch()
		{
			System.setProperty("webdriver.chrome.driver.","D://Selenium//chromedriver.exe");
			driver=new ChromeDriver();
		}
		public static void application_launch(String url)
		{
			driver.get(url);
		}
	}

