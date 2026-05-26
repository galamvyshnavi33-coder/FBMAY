package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//input[@name='email']"));
		act.keyDown(source, Keys.SHIFT).sendKeys("galamvyshnavi33@gmail.com").build().perform();
		Thread.sleep(3000);
	}

}
