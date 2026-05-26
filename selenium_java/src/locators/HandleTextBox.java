package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		System.out.println("print femalerb");
		Thread.sleep(3000);
		driver.close();
	}
}
//    driver.findElement(By.id("englishchbx")).click();
//		Thread.sleep(3000);
//       WebElement hindichbx= driver.findElement(By.id("hindichbx"));
//       hindichbx.click();
//	   Thread.sleep(3000);
//	   if(hindichbx.isSelected())
//	   {
//		   System.out.println("yes");
//	   }
//	   else
//	   {
//		   System.out.println("no");
//	   }
//	   driver.findElement(By.id("registerbtn")).click();
//	   Thread.sleep(3000);
//       System.out.println(driver.findElement(By.id("msg")).getText());
//	   Thread.sleep(3000);
//       driver.findElement(By.linkText("Click here to navigate to the home page")).click();
//	   Thread.sleep(3000);
//       driver.close();
//	}
//}
       
       
       
	   
         
        
        
		
		
		
