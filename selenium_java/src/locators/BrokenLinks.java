package locators;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String linkurl=link.getAttribute("href");
			verifyLink(linkurl);
		}
		driver.quit();
	}
	public static void verifyLink(String linkurl)
	{
		try
		{
			URL link=new URL(linkurl);
			HttpURLConnection httpurlconnection=(HttpURLConnection) link.openConnection();
			httpurlconnection.setConnectTimeout(3000);
			httpurlconnection.connect();
			if(httpurlconnection.getResponseCode()==200)
			{
				System.out.println(linkurl+"-"+httpurlconnection.getResponseMessage());
				
			}
			else
			{
				System.out.println(linkurl+"-"+httpurlconnection.getResponseMessage()+"-"+"is broken link");
			}
		}
		catch(Exception e) 
		{
			System.out.println(linkurl+"-"+"is a broken link");
		}
			
			

	}

}
