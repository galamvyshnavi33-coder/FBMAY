package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-text oxd-select-text--active'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'ESS')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Status']/following::div[@class='oxd-select-text oxd-select-text--active']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'Enabled')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Reset ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vyshnavi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("galam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);

	}

}
