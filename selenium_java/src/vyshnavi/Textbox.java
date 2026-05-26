package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usertxt = driver.findElement(By.id("login_field"));
		if(usertxt.isDisplayed())
		{
			if(usertxt.isEnabled())
			{
			usertxt.sendKeys("hyr");
			String enteredtxt=usertxt.getAttribute("value");
			System.out.println("enteredtxt");
			Thread.sleep(3000);
			usertxt.clear();

		}
		else

			System.out.println("user text is enabled");
		}
		else
			System.out.println("user text is not diaplayed");
}
}