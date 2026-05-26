package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
      	driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("galamvyshnavi33@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Galamvyshu@12");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();


		

		
	}

		


}
