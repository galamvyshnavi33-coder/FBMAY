package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDownKeysUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://www.facebook.com");
	    WebElement source = driver.findElement(By.xpath("//input[@name='email']"));
	    WebElement target = driver.findElement(By.xpath("//input[@name='pass']"));
	    source.sendKeys("galamvyshnavi33@gmail.com");
	    Actions act=new Actions(driver);
	    act.click(source).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    act.click(target).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	}

}
