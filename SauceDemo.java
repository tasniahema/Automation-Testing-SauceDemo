package swagLabs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemo {
	WebDriver driver;

	@Test(priority = 1)
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");

	}

	// login
	@Test(priority = 2)
	public void Login() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Hard Assertion(SwagLabs page )
		WebElement Slabs = driver.findElement(By.xpath("/html/body/div/div/div[1]"));
		String Tasnia = Slabs.getText();
		String Hema = "Swag Labs";
		Assert.assertEquals(Tasnia, Hema, "Condition Mismatch");
		// System.out.println("Hard Assertion");
		System.out.println(Tasnia);
		Thread.sleep(4000);
		// user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// login
		driver.findElement(By.id("login-button")).click();
	}

	// Method Products Page
	@Test(priority = 3)
	public void ProductsPage() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement products = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
		String Product = products.getText();
		String page = "Products";
		Assert.assertEquals(Product, page, "Condition Mismatch");
		// System.out.println("Hard Assertion");
		System.out.println(Product);
		// click add to cart button
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	}

	// Your Cart Page

	@Test(priority = 4)
	public void YourCart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Yourcartpage = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
		String Yourcart = Yourcartpage.getText();
		String pagecart = "Your Cart";
		Assert.assertEquals(Yourcart, pagecart);
		// System.out.println("Hard Assertion");
		System.out.println(Yourcart);
		// click checkout
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
	}

	// information checkout

	@Test(priority = 5)
	public void Checkout() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// hard assertion
		WebElement Check = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
		String Checkinfo = Check.getText();
		String info = "Checkout: Your Information";
		Assert.assertEquals(Checkinfo, info);
		// System.out.println("Hard Assertion");
		System.out.println(Checkinfo);

		driver.findElement(By.id("first-name")).sendKeys("Tasnia");
		driver.findElement(By.id("last-name")).sendKeys("Hema");
		driver.findElement(By.id("postal-code")).sendKeys("1216");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
	}

	// Checkout OverView

	@Test(priority = 6)
	public void CheckoutOverview() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Title = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
		String Actual = Title.getText();
		String Expected = "Checkout: Overview";
		Assert.assertEquals(Actual, Expected);
		// System.out.println("Hard Assertion");
		System.out.println(Actual);
		Thread.sleep(4000);
		driver.findElement(By.id("finish")).click();
	}

	@Test(priority = 7)
	public void CheckoutComplete() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cmplt = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
		String Tasniaa = cmplt.getText();
		String Hemaa = "Checkout: Complete!";
		Assert.assertEquals(Tasniaa, Hemaa, "Condition Mismatch");
		// System.out.println("Hard Assertion");
		System.out.println(Tasniaa);

		Thread.sleep(4000);
		// click back to home button
		driver.findElement(By.id("back-to-products")).click();

	}

	@Test(priority = 8)
	public void ReCheckProducts() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement products = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
		String Product = products.getText();
		String page = "Products";
		Assert.assertEquals(Product, page, "Condition Mismatch");
		// System.out.println("Hard Assertion");
		System.out.println(Product);
	}
}
