package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);

        driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("output")));
		Thread.sleep(3000);
	}

}
