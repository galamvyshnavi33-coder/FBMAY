package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("galamvyshnavi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		Thread.sleep(3000);
        driver.navigate().to("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Create ')]")).click();
		Thread.sleep(3000);	
	}

}
