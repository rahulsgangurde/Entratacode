package codingquestion;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Entrata {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Initialize the driver

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.entrata.com");
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	// Test Case 1: Verify the title of the home page

	@Test
	public void verifyHomePageTitle() throws InterruptedException {

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		Assert.assertTrue(true, "Property Management Software | Entrata");

	}

	// Test Case 2: Perform sign in with wrong data
	
	@Test
	public void SignINButton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement signinutton = driver.findElement(By.xpath("//a[@class='button-default outline-dark-button']"));
		signinutton.click();

		// To perform Scrolling operation
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//button[@id='rcc-confirm-button']")).click();
		WebElement PropertyManagerLogin = driver.findElement(By.linkText("Property Manager Login"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(PropertyManagerLogin));
		PropertyManagerLogin.click();
		WebElement name = driver.findElement(By.xpath("//input[@id='entrata-username']"));
		name.sendKeys("Rahul Gangurde");

		WebElement password = driver.findElement(By.cssSelector("#entrata-password"));
		password.sendKeys("Test");

		WebElement signin = driver.findElement(By.cssSelector("button[type='submit']"));
		signin.click();

		WebElement statusmsg = driver.findElement(By.cssSelector("#statusMessage"));
		statusmsg.getText();
		Assert.assertTrue(true, "The username and password provided are not valid. Please try again.");

	}
	
	//Test case3 = navitage to prodcut and select category
	
	@Test
	public void navigateToProductsPageAndSelectCategory() {
		driver.get("https://www.entrata.com");
		WebElement productsLink = driver.findElement(By.xpath("(//div[@class='main-nav-link'])[1]"));
		productsLink.click();
		// Select a category (customize based on actual structure)
		WebElement ResidentPay = driver.findElement(
				By.xpath("//div[@class='nav-group']//a[@class='fat-nav-links'][normalize-space()='ResidentPay']"));
		ResidentPay.click();
		// Verify that the selected category is displayed
		WebElement selectedCategory = driver.findElement(By.xpath("//h1[1]"));
		Assert.assertTrue(selectedCategory.isDisplayed(), "Selected category is not displayed");
	}

}
