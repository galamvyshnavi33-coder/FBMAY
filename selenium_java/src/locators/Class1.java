package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Allpakages.Allpakages1;

public class Class1 extends Allpakages1
{
	public static void main(String[] args) throws InterruptedException {
		
	
	BaseA.luanch();
	application_luanch(url);
//    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("galamvyshnavi33@gmail.com");
//    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Galamvyshu@123");
//    driver.findElement(By.linkText("Sign in")).click();
//    driver.close();
	
	
//	WebElement username = driver.findElement(By.xpath("//input[@id='_R_64mkqsr9pb6amH1_']"));
//	WebElement password = driver.findElement(By.xpath("//input[@id='_R_66mkqsr9pb6amH1_']"));
//	WebElement Button = driver.findElement(By.xpath("//span[text()='Log in']"));
//	Thread.sleep(3000);
//	username.sendKeys("galamvyshnavi33@gmail.com");
//	Thread.sleep(3000);
//	password.sendKeys("Galamvyshu@123");
//	Thread.sleep(3000);
//	Button.click();
	//Thread.sleep(3000);
	
	
	user_name("vyshnavi");
	Thread.sleep(3000);
	password1("1234");
	Thread.sleep(3000);
	login();
	Thread.sleep(3000);
	driver.close();
	

	
}
}
	
			

