package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://naukari.com");
	    Thread.sleep(3000);
	    String parentwindow=driver.getWindowHandle();
	    Thread.sleep(3000);
	    

	    

	    

	}

}
