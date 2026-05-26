package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.get("https://github.com/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		Thread.sleep(3000);
//		WebElement abc = driver.findElement(By.xpath("//input[@name='login']"));
//		WebElement xyz = driver.findElement(By.xpath("//input[@id='password']"));
//		WebElement acd = driver.findElement(By.xpath("//input[@type='submit']"));
//		WebElement efg = driver.findElement(By.xpath("//a[@id='forgot-password']"));
//		WebElement his = driver.findElement(By.xpath("//a[text()='Create an account']"));
//		abc.sendKeys("galamvyshnavi33@gmail.com");
//		xyz.sendKeys("12345");
//		acd.click();
//		efg.click();
//		his.click();
	}

}
