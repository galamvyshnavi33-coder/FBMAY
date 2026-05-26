package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("hyr tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("galamvyshnavi33@gmail.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
        driver.navigate().back();
		Thread.sleep(3000);
        driver.navigate().forward();
		Thread.sleep(3000);
        driver.close();
	}

}
