package locators;

public class ClassA  extends BaseA{

	public static void main(String[] args) throws InterruptedException {
		BaseA.luanch();
		application_luanch(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().window().minimize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		if("Google".equals(driver.getTitle()))
		{
			System.out.println("google page");
		}
		else
		{
			System.out.println("not google page");
		}
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("------------------------");
		driver.close();
		

	}

}
