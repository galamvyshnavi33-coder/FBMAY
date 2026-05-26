package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
        WebElement abc = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(3000);
        abc.sendKeys("mobiles");
        abc.sendKeys(Keys.ENTER);
        

	}

}
