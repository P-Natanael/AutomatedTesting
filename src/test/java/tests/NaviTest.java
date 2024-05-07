package tests;

	import org.junit.Test;
	import org.junit.Before;
	import org.junit.After;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.JavascriptExecutor;
	public class NaviTest {
	  private WebDriver driver;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void mixedtest() {
	    driver.get("https://demo.plm-zone.com/");
	    driver.manage().window().setSize(new Dimension(1550, 838));
	  //Login process
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("MainContractor2@plm-zone.com");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("Selenium_test_2024");
	    driver.findElement(By.cssSelector("span:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("span:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("button:nth-child(5)")).click();
	    //test section
	    driver.findElement(By.linkText("Satamatunneli")).click();
	    driver.findElement(By.cssSelector(".menu-agreements:nth-child(1)")).click();
	    driver.findElement(By.linkText("Agreement Information")).click();
	    driver.findElement(By.cssSelector("th:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("th:nth-child(3)")).click();
	    driver.findElement(By.cssSelector("th:nth-child(4)")).click();
	    driver.findElement(By.cssSelector("thead .right-align:nth-child(5)")).click();
	    driver.findElement(By.cssSelector("thead .right-align:nth-child(6)")).click();
	    driver.findElement(By.cssSelector("thead .right-align:nth-child(5)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1) > a")).click();
	    driver.findElement(By.cssSelector(".color3 a")).click();
	  }
	}
