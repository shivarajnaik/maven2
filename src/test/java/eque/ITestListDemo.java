package eque;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentsITestLst.class)

public class ITestListDemo  {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void m1() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String str = driver.getTitle();
		System.out.println(str);
		Assert.fail();
		driver.close();
	}
	
	@Test
	public void m2() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String str = driver.getTitle();
		System.out.println(str);
		driver.close();
	}
	

}
