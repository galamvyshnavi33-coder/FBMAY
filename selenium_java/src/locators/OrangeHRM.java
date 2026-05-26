package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("galamvyshnavi33");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
//		Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		Thread.sleep(3000);
//	    driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
		driver.navigate().to("https://google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
        driver.navigate().forward();  
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
      
	}

}
