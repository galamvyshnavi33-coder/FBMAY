package selenium;

public class Class2 extends BaseA{

	public static void main(String[] args) throws InterruptedException
	{
		BaseA.launch();
		application_launch(url);
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		if("Google".equals(driver.getTitle()))
		{
			System.out.println("google page");
		}
		else
		{
			System.out.println("not a google page");
		}
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://fb.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		

	}

}
