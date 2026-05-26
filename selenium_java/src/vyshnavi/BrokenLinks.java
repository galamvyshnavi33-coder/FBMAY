package vyshnavi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	   List<WebElement>alllinks =driver.findElements(By.tagName("a"));
	   for(int i=0;i<=alllinks.size()-1;i++)

	   {
		   System.out.println(alllinks.get(i).getText());
	   }

	}

}
