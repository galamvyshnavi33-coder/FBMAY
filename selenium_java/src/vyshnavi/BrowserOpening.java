package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpening {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("hyr tutorials");
		if("Google".equals(driver.getTitle()))
		{
			System.out.println("google page");
		}
		else
		{
			System.out.println("not a google page");
		}
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.fb.com");
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
