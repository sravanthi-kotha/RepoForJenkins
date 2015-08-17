import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sampleSelenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.get("http://www.google.com");
		driver.close();
		driver.quit();

	}

}
