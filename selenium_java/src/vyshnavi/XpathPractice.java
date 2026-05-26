package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("galamvyshnavi33@gmail.com");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		Thread.sleep(3000);

        
	}

}
