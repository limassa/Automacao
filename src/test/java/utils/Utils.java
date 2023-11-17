package utils;

import java.util.concurrent.TimeUnit;

import org.junit.rules.TestRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.jv.Nalika;

public class Utils {

	public static WebDriver driver;
	
	public static void acessarSistema() {
		//System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("http://wwww.blogdoagi.com.br");
	}
	
	
	public static void wait (int intSegundos) {
			try {
				synchronized (driver) {
				driver.wait(intSegundos * 1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	
		
	}
	
}
