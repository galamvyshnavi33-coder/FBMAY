package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFindingLoctors {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Galamvyshnavi33");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("galamvyshu@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='forgot-password']")).click();
		Thread.sleep(3000);
	}
}
		
		

		

		