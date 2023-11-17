package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Hooks {
	
 @Before(order = 1, value = "@BlogAgi")
 public void setUp() {
	  //acessarSistema();
	  
  }
 
 @After()
 
 public void tearDown() throws InterruptedException {
	 //driver.quit();
 }

}

 