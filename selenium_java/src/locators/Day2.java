package locators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static WebDriver driver;
	public static void scrolldown(int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	public static void scrolup(int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		scrolldown(0,1000);
		scrolldown(0,-1000);
	}

}
