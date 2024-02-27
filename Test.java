package emailTesting;

import java.time.Duration;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.micrometer.core.instrument.config.validate.DurationValidator;

import javax.activation.*;

public class Test {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.optum.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		
		WebElement ele = driver.findElement(By.xpath(""));
		
		driver.findElement(RelativeLocator.with(By.linkText("")).above(ele));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		@SuppressWarnings("unchecked")
		Wait flwait = new FluentWait(driver).
						withTimeout(Duration.ofSeconds(1000)).
						pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		
		
	}
	
	
	
	
	
	
	

}
