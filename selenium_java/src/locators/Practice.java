package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if("Google".equals(driver.getTitle()))
		{
			System.out.println("google page");
		}
		else
		{
			System.out.println("not a google page");
		}
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://fb.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
