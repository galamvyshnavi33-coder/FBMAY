package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Allpages.Loginpage;

public class Class2 extends Loginpage{
	public static void main(String[] args) throws InterruptedException {
		Base1.luanch();
		application_luanch(url);
//		driver.findElement(By.name("email")).sendKeys("galamvyshnavi33@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.name("pass")).sendKeys("Glamvyshu@123");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("log in")).click();
//		driver.close();
//        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
//        WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//        WebElement button = driver.findElement(By.xpath("//span[text()='Log in']"));
//        username.sendKeys("galamvyshnavi33@gmail.com");
//        Thread.sleep(2000);
//        password.sendKeys("Glamvyshu@123");
//        Thread.sleep(2000);
//
//        button.click();
//        Thread.sleep(2000);
		user_name("galamvyshnavi33@gmail.com");
		password1("Galamvyshu@123");
		login();
		driver.close();	
	}
	

}
