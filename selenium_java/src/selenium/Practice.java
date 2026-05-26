package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.getTitle();
	driver.get("https://facebook.com");
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.close();

	}

}
