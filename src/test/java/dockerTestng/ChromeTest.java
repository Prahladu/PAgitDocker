package dockerTestng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class ChromeTest {
 @Test
	public void Test() throws MalformedURLException {
		DesiredCapabilities dc= DesiredCapabilities.chrome();
		 URL url = new URL("http://localhost:4444/wd/hub");
		 RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		 driver.get("https://kp.org");
		 System.out.println("Title of the page from Chrome Browser" + driver.getTitle());
		 driver.quit();
	}
}
