package vyshnavi;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		String parentwindowhandle=driver.getWindowHandle();
		System.out.println("parent window handle-"+parentwindowhandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>windowhandles=driver.getWindowHandles();
		for(String windowhandle:windowhandles)
		{
			if(!windowhandle.equals(parentwindowhandle))
			{
				driver.switchTo().window(windowhandle);
				driver.manage().window().maximize();
		
			}
			System.out.println(windowhandle);
		}
		driver.quit();
	}

}
