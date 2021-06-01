import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JenkinsTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void init() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(500);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		//driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Aman");
		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("Aman@gmail.com");
		driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("Chandigarh");
	}
	
	@Test
	public void submit() {
		driver.findElement(By.xpath("//*[@id='submit']")).click();
	}

}
