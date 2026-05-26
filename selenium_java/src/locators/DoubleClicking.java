package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClicking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement source = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//        act.doubleClick(source).build().perform();
//		Thread.sleep(3000);
//		
		WebElement source = driver.findElement(By.xpath("//span[text()='right click me']"));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		act.contextClick(source).build().perform();
		Thread.sleep(3000);
		
		;

	}

}
