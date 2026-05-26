package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		Thread.sleep(3000);
		Actions act=new Actions(driver);
//		WebElement source = driver.findElement(By.xpath("//li[@data-id='5']/a"));
//		WebElement destination = driver.findElement(By.xpath("//ol[@id='bank']/li"));
//		act.dragAndDrop(source, destination).build().perform();
		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(3000);
//		WebElement source = driver.findElement(By.xpath("//span[text()='Login']"));
//		act.moveToElement(source).build().perform();
//		WebElement destination = driver.findElement(By.xpath("//span[@class='b3wTlE']"));
//		act.click(destination).build().perform();
//		WebElement sublink = driver.findElement(By.xpath("//div[text()='Orders']"));
//		act.click(sublink).build().perform();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);	
	}
		
	

}
