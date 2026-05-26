package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practices {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.id("user-name"));
		Thread.sleep(3000);
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//span[text()='Products']")).getText();
		if(text.equals("products"))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("login failed");
		}
		driver.close();
	}

}
