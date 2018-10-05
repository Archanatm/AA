package a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AA 
{
	@Test
	
	public void test()
	{
		WebDriver dr = new FirefoxDriver();
		dr.get("https://stackoverflow.com/questions/7600898/testng-error-cannot-find-class-in-classpath");
		System.out.println("Ganeshaaaaaaaaaaaaaaaaa");
	}

}
