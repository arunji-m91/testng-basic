package data.provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderCheck {
	/*
	 * dataprovider we pass n no of datas to webpage eg test fb login page by giving
	 * various combination inputs
	 */

	WebDriver driver;

	@Test(dataProvider = "result")
	private void login(String user, String pass) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.close();
	}

	@org.testng.annotations.DataProvider(name="result")
	public Object[][] DataProvider() {
		Object[][] data = new Object[3][2];
		// save the combination in array like this
		data[0][0] = "arunji";
		data[0][1] = "arun123";

		data[1][0] = "kumar";
		data[1][1] = "kumar123";

		data[2][0] = "meera";
		data[2][1] = "meera123";

		return data;

	}

}
