package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACtion {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act=new Actions(driver);
//		WebElement source = driver.findElement(By.xpath("//li[@data-id='5']/a"));
//		WebElement destination = driver.findElement(By.xpath("//ol[@id='bank']/li"));
//		act.dragAndDrop(source, destination).build().perform();	
		WebElement source = driver.findElement(By.xpath("//li[@data-id='6']/a"));
		WebElement destination = driver.findElement(By.xpath("//ol[@id='loan']/li"));
		act.dragAndDrop(source, destination).build().perform();
	}

}
