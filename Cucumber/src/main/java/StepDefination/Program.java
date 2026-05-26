package StepDefination;

import static org.testng.Assert.assertTrue;

import  org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Program {
	public static void login()
	{
		System.out.println("data");
	}
	public static void main(String[] args) 
	{
		String expectedresults="hello welcome to selenium";
		String actualresults="hello welcome to selenium";
		boolean results=false;
	
		//Assert.assertEquals(expectedresults,actualresults,"both are not matching" );
		//Assert.assertTrue(results,"it is not valid");//hard assert
		login();
       
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expectedresults, actualresults,"both are not matching");
		sa.assertTrue(results,"it is not valid");
		sa.assertAll();
		
		
		
		
		
		
		login();
	}
	

	
}
