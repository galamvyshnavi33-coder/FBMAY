package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1245");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);

		WebElement abc = driver.findElement(By.partialLinkText("//p[text()='Forgot your password? ']"));
		abc.click();
		

		;
	}

}
