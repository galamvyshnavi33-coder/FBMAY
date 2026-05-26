package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chome,driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		WebElement abc = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		abc.sendKeys("kurta set for women");
		abc.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

}
