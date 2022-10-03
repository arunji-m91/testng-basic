package passparameter.fromtestng.xml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterPassFromNgXml {
	WebDriver driver;
	@Parameters({"user123","user123"})
	@Test
	private void login(String user,String pass) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}

}
