package SwitchCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCase {
	public static void main(String[] args) {
		String[] browsers = { "chrome", "firefox", "edge" }; 

		for (String browser : browsers) {
			WebDriver driver = null;
			System.out.println("Running on: " + browser);

			switch (browser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Invalid browser name!");
				continue;
			}

			driver.manage().window().maximize();
			driver.get("https://parabank.parasoft.com/parabank/index.htm");

		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.close();
			System.out.println(browser + " execution completed.\n");
		}
	}
}