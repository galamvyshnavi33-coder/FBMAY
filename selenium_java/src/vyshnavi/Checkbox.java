package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindichbx = driver.findElement(By.id("hindichbx"));
		Thread.sleep(3000);
		hindichbx.click();
		if(hindichbx.isSelected())
			hindichbx.click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
        driver.findElement(By.id("Click here to navigate to the home page")).click();
		Thread.sleep(3000);	

	}

}
