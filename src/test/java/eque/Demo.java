package eque;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	 static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}


		public static void main(String [] args)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
		}


}
