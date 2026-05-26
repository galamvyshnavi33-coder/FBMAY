package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//span[text()='Login']"));
		act.moveToElement(source).build().perform();
		WebElement ele = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		ele.sendKeys("996371091");
//		WebElement sublink = driver.findElement(By.xpath("//div[text()='Orders']"));
//		act.click(sublink).build().perform();
		

	}

}
